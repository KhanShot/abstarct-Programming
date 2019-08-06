public class Cut extends AllCommands {

    public Cut(Editor editor) {
        super(editor);
    }

    @Override
    public boolean DO() {
        if (editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textField.getText();
        editor.bufferObmen = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd(), source.length());
        return start + end;
    }
}