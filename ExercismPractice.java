import java.util.HashMap;
import java.util.Map;

class RnaTranscription {
    private final Map<Character, Character> transcriptionMap;

    public RnaTranscription() {
        transcriptionMap = new HashMap<>();
        transcriptionMap.put('G', 'C');
        transcriptionMap.put('C', 'G');
        transcriptionMap.put('T', 'A');
        transcriptionMap.put('A', 'U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        for (char c : dnaStrand.toCharArray()) {
            if (transcriptionMap.containsKey(c)) {

                sb.append(transcriptionMap.get(c));

            } else {
                throw new IllegalArgumentException("Invalid nucleotides: " + sb.toString().trim());

            }
        }
        return sb.toString();
    }

}

public class ExercismPractice {
    public static void main(String[] args) {
        RnaTranscription transcriber = new RnaTranscription();

        // Example usage:
        String dnaStrand = "T";
        String rnaStrand = transcriber.transcribe(dnaStrand);

        System.out.println("DNA Strand: " + dnaStrand);
        System.out.println("RNA Strand: " + rnaStrand);
    }
}
