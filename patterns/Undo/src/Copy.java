public class Copy extends AllCommands {

    public Copy(Editor editor) {
        super(editor);
    }

    @Override
    public boolean DO() {
        editor.bufferObmen = editor.textField.getSelectedText();
        return false;
    }
}