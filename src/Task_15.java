/**
 * Task15: Реализовать иерархию классов для фильтрации комментариев
 * Input: TextAnalyzer[] analyzers, String text
 * Output: Label flag
 */
public class Task_15 {
    public static void solve() {
        String text = "This is a test_1sell \n" + "This is a test_2:( \n" + "This is a test_3\n";
        TextAnalyzer[] arr = new TextAnalyzer[] {
                new SpamAnalyzer(new String[] { "sell" }, Label.SPAM),
                new Negative_Analyzer(),
                new TooLongAnalyzer(100) };
        Label res = checkLabels(arr, text);
        System.out.println(res);
    }

    static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label flag = Label.OK;
        for (TextAnalyzer text_anzer : analyzers) {
            flag = text_anzer.processtext(text);
            if (flag != Label.OK)
                break;
            // (flag != Label.OK) ? "fff" : "ddd";
        }
        return flag;
    }
}

interface TextAnalyzer {
    Label processtext(String text);
}

enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

abstract class KeywordAnalyzer implements TextAnalyzer {
    public Label posLabel;

    protected KeywordAnalyzer(Label posLabel) {
        this.posLabel = posLabel;
    }

    abstract protected String[] getKeywords();

    abstract protected Label getLabel();
}

class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords, Label posLabel) {
        super(posLabel);
        this.keywords = keywords;
    }

    public String[] getKeywords() {
        return this.keywords;
    }

    public Label getLabel() {
        return this.posLabel;
    }

    public Label processtext(String text) {
        Label flag = Label.OK;
        String[] words = text.trim().split("\s+");
        for (String word : words) {
            for (String keyword : this.keywords) {
                if (word.equals(keyword)) {
                    flag = this.posLabel;
                    break;
                }
            }
        }
        return flag;
    }
}

class Negative_Analyzer extends KeywordAnalyzer {
    String[] keywords;

    public Negative_Analyzer() {
        super(Label.NEGATIVE_TEXT);
        this.keywords = new String[] { ":(", "=(", ":|" };
    }

    public String[] getKeywords() {
        return this.keywords;
    }

    public Label getLabel() {
        return this.posLabel;
    }

    public Label processtext(String text) {
        Label flag = Label.OK;
        String[] words = text.trim().split("\s+");
        for (String word : words) {
            for (String keyword : this.keywords) {
                if (word.indexOf(keyword) != -1) {
                    flag = this.posLabel;
                    break;
                }
            }
        }
        return flag;
    }

}

class TooLongAnalyzer implements TextAnalyzer {
    int maxLength;

    public TooLongAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processtext(String text) {
        int char_num = text.length();
        return char_num < this.maxLength ? Label.OK : Label.TOO_LONG;
    }
}
