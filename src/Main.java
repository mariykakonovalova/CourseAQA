public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1*", "2", "2", "2"},
                {"1", "2", "7", "9"},
                {"1", "2", "3", "5"},
                {"1", "0", "2", "1"}
        };
        try {
            System.out.println(sum(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Не удалось просуммировать элементы массива. \n" + e.getMessage());
        }
    }

    public static int sum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В ячейке [%s][%s] лежат неверные данные: '%s'", i, j, array[i][j]));
                }
            }
        }
        return sum;
    }

}