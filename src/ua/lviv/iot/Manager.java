package ua.lviv.iot;

  class Manager {

    public static int comparison1;
    public static int swap1;

    public static int getComparison1() {
        return comparison1;
    }

    public static int getSwap1() {
        return swap1;
    }

    public Screen[] insertionSort(Screen[] screens) {
        int swap = 0;
        int comparison = 0;
        for (int i = 1; i < screens.length; i++) {
            Screen element = screens[i];
            int previousElement = i - 1;
            comparison = comparison + 1;
            while (previousElement > 0 && screens[previousElement].getHeight() < element.getHeight()) {
                screens[previousElement + 1] = screens[previousElement];
                swap = swap + 1;
                previousElement = previousElement - 1;
            }
            screens[previousElement + 1] = element;
            swap = swap + 1;
        }
        System.out.println("Insertion Sort");
        System.out.println("Insertion Sort comparison:" + comparison);
        System.out.println("Insertion Sort swap:" + swap);
        return screens;
    }

    public void mergeSort(Screen[] screens, int n) {
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

    public void merge(
            Screen[] a, Screen[] l, Screen[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            comparison1++;
            if (l[i].getWidth() >= r[j].getWidth()) {
                a[k++] = l[i++];
                swap1++;
            } else {
                a[k++] = r[j++];
                swap1++;
            }
        }
        while (i < left) {
            a[k++] = l[i++];
            swap1++;

        }
        while (j < right) {
            a[k++] = r[j++];
            swap1++;
        }
    }
}
