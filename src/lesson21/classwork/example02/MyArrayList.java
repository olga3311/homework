package lesson21.classwork.example02;

public class MyArrayList {
    private String [] array;
    private int size;

    public MyArrayList(int initialSize){
        size = initialSize;
        array = new String[size];
    }

    public  MyArrayList (){
        this(0);
    }

    public int getSize(){
        return size;
    }
    public String get(int index){
            return array[index];
    }
    public void set(int index, String value){
        array[index] = value;
    }
    public int indexOf(String value) {
        for ( int i = 0; i < size; i++ ){
            if ( array[i].equals(value)){
                return  i;
            }
        }
        return -1;
    }
    // есть ли value  в списке
    public  boolean contains (String value) {
        return indexOf(value) != -1;
    }
    public void reSize(int newSize) {
        // создаем новый массив нового размера
        String[] temp = new String[newSize];

        // MAth.min выбирает мин из двух значений
        // выбираем меньший
        int minSize = Math.min(size, newSize);

        //копируем элементы из старого массива в новый
        for (int i =0; i< minSize; i++){
            temp[i] = array[i];
        }

        //меняем ссылку и сохраненный размер массива
        array = temp;
        size = newSize;
    }

    public  void add(String value) {
        if (size + 1 > array.length) {
            reSize(size + 1);
            // отнимаем 1 потому что в resize  уже изменили прееменную  size
            array[size - 1] = value;
        }else{
            //вставляем элемент по индексу размер  послепоследнего
            array[size] = value;
            // размер увеличиваем
            size++;
        }
    }

    public  void  remove(int index) {
        for (int i = index; i < size -1; i++){
            array[i] = array [ i + 1];
        }
        size--;
    }


}

