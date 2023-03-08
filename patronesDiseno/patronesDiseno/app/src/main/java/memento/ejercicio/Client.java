package memento.ejercicio;

public class Client {
    public static void main(String[] args) {
        Backups backups = new Backups();
        Backup backup = new Backup();

        BaseDatos baseDatos = new BaseDatos();

        Persona a = new Persona("A", "1", 20);
        Persona b = new Persona("A", "2", 20);
        Persona c = new Persona("A", "3", 20);
        Persona d = new Persona("A", "4",20);
        Persona e = new Persona("A", "5",20);

        baseDatos.addPersona(a).addPersona(b).addPersona(c).addPersona(d).addPersona(e);

        backup.setBackup(baseDatos);
        backups.createBackup(backup.newBackup("backupenero"));

        Persona a1 = new Persona("A", "11", 20);
        Persona b1 = new Persona("A", "21", 20);
        Persona c1 = new Persona("A", "31", 20);
        Persona d1 = new Persona("A", "41",20);
        Persona e1 = new Persona("A", "51",20);

        baseDatos.addPersona(a1).addPersona(b1).addPersona(c1).addPersona(d1).addPersona(e1);

        backup.setBackup(baseDatos);
        backups.createBackup(backup.newBackup("backupfebrero"));

        Persona a11 = new Persona("A", "111", 20);
        Persona b11 = new Persona("A", "211", 20);
        Persona c11 = new Persona("A", "311", 20);
        Persona d11 = new Persona("A", "411",20);
        Persona e11 = new Persona("A", "511",20);
        Persona a12 = new Persona("A", "112", 20);
        Persona b12= new Persona("A", "212", 20);
        Persona c12 = new Persona("A", "312", 20);
        Persona d12 = new Persona("A", "412",20);
        Persona e12 = new Persona("A", "512",20);

        baseDatos.addPersona(a11).addPersona(b11).addPersona(c11).addPersona(d11).addPersona(e11)
        .addPersona(a12).addPersona(b12).addPersona(c12).addPersona(d12).addPersona(e12);

        backup.setBackup(baseDatos);
        backups.createBackup(backup.newBackup("backupmarzo"));

        Persona a13 = new Persona("A", "113", 20);
        Persona b13 = new Persona("A", "213", 20);
        Persona c13 = new Persona("A", "313", 20);
        Persona d13 = new Persona("A", "413",20);
        Persona e13 = new Persona("A", "513",20);

        baseDatos.addPersona(a13).addPersona(b13).addPersona(c13).addPersona(d13).addPersona(e13);

        backup.setBackup(baseDatos);
        backups.createBackup(backup.newBackup("backupabril"));


        Persona a131 = new Persona("A", "1131", 20);
        Persona b131 = new Persona("A", "2131", 20);
        Persona c131 = new Persona("A", "3131", 20);
        Persona d131 = new Persona("A", "4131",20);
        Persona e131 = new Persona("A", "5131",20);
        Persona a132 = new Persona("A", "1132", 20);
        Persona b132 = new Persona("A", "2132", 20);
        Persona c132 = new Persona("A", "3132", 20);
        Persona d132 = new Persona("A", "4132",20);
        Persona e132 = new Persona("A", "5132",20);
        Persona a133 = new Persona("A", "1133", 20);
        Persona b133 = new Persona("A", "2133", 20);
        Persona c133 = new Persona("A", "3133", 20);
        Persona d133 = new Persona("A", "4133",20);
        Persona e133 = new Persona("A", "5133",20);
        Persona a134 = new Persona("A", "1134", 20);
        Persona b134 = new Persona("A", "2134", 20);
        Persona c134 = new Persona("A", "3134", 20);
        Persona d134 = new Persona("A", "4134",20);
        Persona e134 = new Persona("A", "5134",20);
        Persona a135 = new Persona("A", "1135", 20);
        Persona b135 = new Persona("A", "2135", 20);
        Persona c135 = new Persona("A", "3135", 20);
        Persona d135 = new Persona("A", "4135",20);
        Persona e135 = new Persona("A", "5135",20);

        baseDatos.addPersona(a131).addPersona(b131).addPersona(c131).addPersona(d131).addPersona(e131)
        .addPersona(a132).addPersona(b132).addPersona(c132).addPersona(d132).addPersona(e132)
        .addPersona(a133).addPersona(b133).addPersona(c133).addPersona(d133).addPersona(e133)
        .addPersona(a134).addPersona(b134).addPersona(c134).addPersona(d134).addPersona(e134)
        .addPersona(a135).addPersona(b135).addPersona(c135).addPersona(d135).addPersona(e135);

        backup.setBackup(baseDatos);
        backups.createBackup(backup.newBackup("backupmayo"));

        try {
            baseDatos = backup.restoreBackup(backups.getBackup("backupfebrero"));
            baseDatos.show();
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }

    }
}
