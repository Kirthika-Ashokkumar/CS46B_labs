package stacklab;

import java.util.*;


public class UndoRedoPainter extends Painter
{
	// Called when the user pushes the Undo button.
	void undo()
	{
		Stack<Circle> history = getHistory();
		if(!history.isEmpty()) {
			getUndoHistory().push(history.pop());
			repaint();
		}
	}


	// Called when the user pushes the Redo button.
	void redo()
	{
		Stack<Circle> undoHistory = getUndoHistory();
		if(!undoHistory.isEmpty()) {
			getHistory().push(undoHistory.pop());
			repaint();
		}
	}
	
	
	public static void main(String[] args)
	{
		new UndoRedoPainter().setVisible(true);
	}
}
