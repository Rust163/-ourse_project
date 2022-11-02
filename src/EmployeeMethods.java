public class EmployeeMethods {
    public static void borderLine() {
        System.out.println("===========================================================================================================");
    }
    //-----------Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).-------
    public static void employeesList(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
//---------------Посчитать сумму затрат на зарплаты в месяц.----------------------------------------------
    public static void monthlySalaryCosts(Employee[] arr) {
        float totalSumSalary = 0f;
        for (int i = 0; i < arr.length; i++) {

            totalSumSalary += arr[i].getSalary();

        }
        System.out.println("Сумарные затраты на зарплаты: " + totalSumSalary);
    }
//----------------Найти сотрудника с минимальной зарплатой. -----------------------------------------------
    public static void minSalaryEmployee(Employee[] arr) {
        float min = arr[0].getSalary();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()) {
                    min = arr[i].getSalary();
                    k = i;
                }
            }
        }
        System.out.println("Минимальная зарплата у: " + arr[k]);
    }
//-----------------Найти сотрудника с максимальной зарплатой.---------------------------------------------
    public static void maxSalaryEmployee(Employee[] arr) {
        float max = arr[0].getSalary();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                    k = i;
                }
            }
        }
        System.out.println("Максимальная зарплата у: " + arr[k]);
    }
//------------------Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b). ---------
    public static void averageValue (Employee[] arr) {
        float averageSum = 0f;
        float totalSumSalary = 0f;
        for (int i = 0; i < arr.length; i++) {
            totalSumSalary += arr[i].getSalary();
            averageSum = totalSumSalary / 31;
        }
        System.out.println("Среднее значение зарплат: " + averageSum);
    }
//------------------Получить Ф. И. О. всех сотрудников (вывести в консоль).------------------------------------

    public static void listEmployee(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName());
        }
    }
}
