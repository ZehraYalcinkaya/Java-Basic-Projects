public class Main {
    public static void main(){

        KrediUI krediUI= new KrediUI();
        TeacherKrediManager teacherKrediManager = new TeacherKrediManager();


        krediUI.CalculateKredi(teacherKrediManager);
        //krediUI.CalculateKredi(new TeacherKrediManager()); eğer döneceği değer tek seferlik ve bir başka yerde kullanılmayacaksa bu şekile anonim(tek kullanımlık) şekilde kullanabiliriz
        

    }
}

