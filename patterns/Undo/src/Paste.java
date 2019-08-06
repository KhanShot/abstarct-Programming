public class Paste extends AllCommands {

    public Paste(Editor editor) {
        super(editor);

    }

    @Override
    public boolean DO() {
        if (editor.bufferObmen == null || editor.bufferObmen.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.bufferObmen, editor.textField.getCaretPosition());
        return true;
    }
}