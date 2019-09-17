package ua.lviv.iot;

class Manager {

    static int mergeComparison;
    static int mergeSwap;
    static int insertionComparison;
    static int insertionSwap;

    Screen[] insertionSort(Screen[] screens) {
        for (int i = 1; i < screens.length; i++) {
            Screen element = screens[i];
            int previousElement = i - 1;
            insertionComparison++;
            while (previousElement > 0 && screens[previousElement].getHeight() < element.getHeight()) {
                screens[previousElement + 1] = screens[previousElement];
                insertionSwap++;
                previousElement = previousElement - 1;
            }
            screens[previousElement + 1] = element;
            insertionSwap++;
        }
        return screens;
    }

    void mergeSort(Screen[] screens, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Screen[] l = new Screen[mid];
        Screen[] r = new Screen[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = screens[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = screens[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(screens, l, r, mid, n - mid);
    }

    private void merge(
            Screen[] a, Screen[] l, Screen[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            mergeComparison++;
            if (l[i].getWidth() >= r[j].getWidth()) {
                a[k++] = l[i++];
                mergeSwap++;
            } else {
                a[k++] = r[j++];
                mergeSwap++;
            }
        }
        while (i < left) {
            a[k++] = l[i++];
            mergeSwap++;

        }
        while (j < right) {
            a[k++] = r[j++];
            mergeSwap++;
        }
    }
}
