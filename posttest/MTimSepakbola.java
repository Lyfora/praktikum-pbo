// Nama : Axelliano Rafael Situmeang
//NIM : 24060121130089


class MTimSepakbola {
    public static void main(String[] args) {
        // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
        TimSepakbola liverpool = new TimSepakbola("Liverpool");

        // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
        TimSepakbola MU = new TimSepakbola("Manchester United");

        // TODO: call startTandingBola()
        liverpool.startTandingBola(MU);

        // Assume that liverpool wins against manchesterUnited 7 - 0
        for (int i = 0; i < 7; i++) {
            liverpool.goal();

            // TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
            // Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
            System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.skor + " - " + MU.skor + " " + MU.nama);
        }

        // TODO: call endTandingBola()
        liverpool.endTandingBola(MU);
    }
}
