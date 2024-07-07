public class Employee {
    String name;
    double salary;
    int workHour;//haftalık çalışma saati
    int hireYear; //işe başlama yılı şimdiki yıl 2040 olsun

    Employee(String name, double salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    void raiseSalary() {
        // çalışma yılına göre maaş artışı
        if (2040 - this.hireYear >= 20) {
            this.salary *= 1.75;//%75 zam
        } else if (2040 - this.hireYear >= 15) {
            this.salary *= 1.5;//%50 zam
        } else if (2040 - this.hireYear >= 10) {
            this.salary *= 1.25;//%25 zam
        }
        //haftalık çalışma saatine göre maaş artışı
        if (this.workHour > 30) {
            this.salary += (this.workHour-30) * 400;
        }
        System.out.println("Net Maaş: " + this.salary);
    }
    void tax() {
        if (this.salary > 55000) {
            System.out.println("Vergi: " + this.salary * 0.03);
            this.salary *= 0.97;// %3 vergi
            System.out.println("Brüt Maaş: " + this.salary);
        } else {
            System.out.println("Vergi: " + this.salary * 0.01);
            this.salary *= 0.99;// %1 vergi
            System.out.println("Brüt Maaş: " + this.salary);
        }
    }

    void printEmployee() {
        System.out.println("Çalışan: " + this.name);
        System.out.println("İşe başlama yılı: " + this.hireYear);
        System.out.println("Haftada kaç saat çalışıyor: " + this.workHour);
    }
}
