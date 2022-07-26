import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Resourse {

    public static int balancePoint(int[] input) {
        int leftSum = input[0];
        int rightSum = 0;
        ;
        for (int i = 0; i < input.length; i++)
            rightSum += input[i];

        for (int i = 0; i < input.length - 1; i++) {
            if (leftSum == rightSum)
                return i;
            leftSum += input[i + 1];
            rightSum -= input[i];
        }
        return -1;

        // Your code goes eq9r80
    }


    public static long multiply(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b < 0) {
            return -a + multiply(a, b + 1);
        } else {
            return a + multiply(a, b - 1);
        }

    }

    public static double sumatoria(double n) {
        if (n <= 1) {
            return 1
                    ;
        } else return 1 / n + sumatoria((n - 1));
    }


    public static double sumatoria2(double n) {
        double y = 0;
        for (int i = 1; i <= n; i++) {
            y = y + (1 / i);
        }
        return y;
    }

    public static String reverseString(String str) {
        if (str == null) {
            return "11";
        }
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public int parnumeros(int[] arr) {
        int retorno = 0;
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; arr.length > i; ++i) {

            for (int j = 0; arr.length - 1 > j; ++j) {

                int number = arr[i] + arr[j];
                map.put(number, i + "," + j);
            }
        }
        Set<Map.Entry<Integer, String>> sumas = map.entrySet();

        sumas.stream().sorted();

        return 0;
    }

    static List<Persona> personas = Arrays.asList(new Persona(4, "juan"),
            new Persona(50, "auan"),
            new Persona(7, "puan"),
            new Persona(18, "luan"),
            new Persona(27, "nuan"),
            new Persona(34, "auan"));


    //// Dada una lista de personas, filtrar las que sean mayores de 25 años y ordenarlas por el nombre
    public static List<Persona> mayores() {
        return personas.stream().filter(x -> x.getEdad() > 25).
                sorted((p, y) -> p.getNombre().compareTo(y.nombre))
                .collect(Collectors.toList());
    }

    static Integer[] o = {-2, 4, 6, 1, 8, 0, -5, -8};

    //calcular el par de elementos que tiene una suma mas cercana a cero de manera eficiente
//[-2, 4,6,1,8,0,-5, -8]
    public static void cercanoacero(Integer[] arr) {
        List<Integer> l = Arrays.asList(arr);
        List<Integer> x = new ArrayList();
        l.stream().reduce((a, b) -> {
            x.add(a + b);
            return b; // will be "a" for next reduction
        });
        x.stream().filter(q -> q >= 0 || q < 0).forEach(System.out::println);//el primer elemento es la suma mas cercana a cero
    }


    public static void main(String[] args) {
        //System.out.println(sumatoria(435));
        //System.out.println(reverseString("12345678909"));
        //mayores().forEach(x-> System.out.println(x.edad+ ","+ x.getNombre() ));
        // System.out.println(balancePoint(new int[] { 2, 7, 4, 5, -3, 8, 9, -1 }));
        //  System.out.println(multiply(9,-5));
        //cercanoacero(o);

        //List<String> courses = Arrays.asList("Java", "Python", "Javascript", "NodeJS");

        //long count = courses.stream().filter( c->c.startsWith("J"))
        //       .collect(Collectors.toList()).size();

        //     System.out.println(count);

        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int x = Arrays.stream(numbers).reduce(0,
        //       Integer::sum);
        // System.out.print(x);
        //  String[] fruits = {"banana", "plum", "pears", "orange"};
        //Arrays.sort(fruits, Comparator.naturalOrder());


        //for (String s : fruits) {
        //System.out.print(" "+s);
        //}
        // }
       int[] x = {6, 7, 2, 9, 2, 2, 2};
        //List c = Arrays.asList(x);
        //maxTrailing(c);
        //maxTrailing2(c);
        System.out.println(repetidos(Arrays.stream(x).boxed().collect(Collectors.toList())));
        System.out.println(buscarRecursivo2(x, 0, 1,1));
    }


    public static void maxTrailing(List<Integer> levels) {        // Write your code here

        int aux2 = 0;
        int n = levels.size();
        List<Integer> rest = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n) {
            if (i != 0) {
                j=0;

                while (j < i) {
                    if (levels.get(i) >levels.get(j)) {
                        rest.add(levels.get(i) - levels.get(j));
                    }
                    j++;

                }
            }
            i++;
        }

        rest.forEach(System.out::println);
        System.out.println("==============");
        Object[] x = rest.toArray();
        Arrays.sort(x);
       // System.out.println(x[x.length - 1]);
    }

    public static int buscarRecursivo(int A[], int clave, int n, int i){
            if (i==n){ return -1;}
            else if(A[i]==clave){ return i;}
            else {return buscarRecursivo(A,clave,n,i+1);}


    }
    public static int buscarRecursivo2(int A[], int i, int j,int count){
        if (j==i &&i!=0){ return -1;}
        else if(A[i]==A[j]){
             count++;}
        else {return buscarRecursivo2(A,j+1,i,count);}

        return count;
    }

    public static Map<Integer,Integer> repetidos(List <Integer> x){
        Map<Integer,Integer> repetidos = new HashMap<>();
        for(int p: x){
            if(repetidos.get(p)==null){
                repetidos.put(p,0);
            }else {
                repetidos.put(p, repetidos.get(p)+1);
            }
        }
        return repetidos;
    }

    public static void maxTrailing2(List<Integer> levels) {        // Write your code here

        int aux2 = 0;
        int n = levels.size();
        List<Integer> rest = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    if (levels.get(i) > levels.get(j)) {
                        rest.add(levels.get(i) - levels.get(j));
                    }
                }
            }
        }
        rest.forEach(System.out::println);
        Object[] x = rest.toArray();
        Arrays.sort(x);
        //System.out.println(x[x.length - 1]);
    }


}

class Persona {
    int edad;
    String nombre;


    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

