import java.util.Hashtable;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hashtable<String, String> morseCastellano = new Hashtable<>();
        morseCastellano.put("a", "._");
        morseCastellano.put("b", "_...");
        morseCastellano.put("c", "_._.");
        morseCastellano.put("d", "_..");
        morseCastellano.put("e", ".");
        morseCastellano.put("f", ".._.");
        morseCastellano.put("g", "--.");
        morseCastellano.put("h", "....");
        morseCastellano.put("i", "..");
        morseCastellano.put("j", ".---");
        morseCastellano.put("k", "_._");
        morseCastellano.put("l", "._..");
        morseCastellano.put("m", "--");
        morseCastellano.put("n", "_.");
        morseCastellano.put("o", "---");
        morseCastellano.put("p", ".--.");
        morseCastellano.put("q", "--.-");
        morseCastellano.put("r", "._.");
        morseCastellano.put("s", "...");
        morseCastellano.put("t", "_");
        morseCastellano.put("u", ".._");
        morseCastellano.put("v", "..._");
        morseCastellano.put("w", ".__");
        morseCastellano.put("x", "_.._");
        morseCastellano.put("y", "_.__");
        morseCastellano.put("z", "__..");

        morseCastellano.put("0", "_____");
        morseCastellano.put("1", ".____");
        morseCastellano.put("2", "..___");
        morseCastellano.put("3", "...__");
        morseCastellano.put("4", "...._");
        morseCastellano.put("5", ".....");
        morseCastellano.put("6", "_....");
        morseCastellano.put("7", "__...");
        morseCastellano.put("8", "___..");
        morseCastellano.put("9", "____.");

        while (true) {
            System.out.println("Introduce el texto (sin tildes) para traducir a código Morse (escribe 'terminar' para salir):");
            String texto = scanner.nextLine().toLowerCase();

            if (texto.equals("terminar")) {
                System.out.println("Programa terminado.");
                break;
            }
            String morseTraducido = traducirTextoAMorse(texto, morseCastellano);
            System.out.println("Traducción a Morse: " + morseTraducido);
        }
        scanner.close();
    }

    private static String traducirTextoAMorse(String texto, Hashtable<String, String> morseTable) {
        StringBuilder morse = new StringBuilder();
        for (char c : texto.toCharArray()) {
            String caracter = String.valueOf(c);
            if (caracter.equals(" ")) {
                morse.append("/ ");
            } else if (morseTable.containsKey(caracter)) {
                morse.append(morseTable.get(caracter)).append(" ");
            } else {
                morse.append("? ");
            }
        }
        return morse.toString().trim();
    }
}
