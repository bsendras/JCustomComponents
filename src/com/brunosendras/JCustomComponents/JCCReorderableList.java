package com.brunosendras.JCustomComponents;

import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.JList;

public class JCCReorderableList<T> extends JList<T> 
		implements DragSourceListener, DropTargetListener, DragGestureListener {
	
	private static final long serialVersionUID = -6744812225689829898L;

	// Atributes
	static DataFlavor localObjectFlavor;
	static { 
		try {
			localObjectFlavor = new DataFlavor (DataFlavor.javaJVMLocalObjectMimeType);
		} catch (ClassNotFoundException e) {
			
		}
	}
	static DataFlavor[] supportedFlavors = {localObjectFlavor};
		
	
	// Constructors
	public JCCReorderableList() {
		
	}
	
	// Methods
	
	
	//------------------------------------------------- 
	// Interface implementation:
	// 				
	//				DragSourceListener
	//
	//-------------------------------------------------
	@Override
	public void dragDropEnd(DragSourceDropEvent dsde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragEnter(DragSourceDragEvent dsde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragExit(DragSourceEvent dse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragOver(DragSourceDragEvent dsde) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropActionChanged(DragSourceDragEvent dsde) {
		// TODO Auto-generated method stub
		
	}

	//------------------------------------------------- 
	// Interface implementation:
	// 				
	//				DropTargetListener
	//
	//-------------------------------------------------
	@Override
	public void dragEnter(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dragExit(DropTargetEvent dte) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dragOver(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void drop(DropTargetDropEvent dtde) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {
		// TODO Auto-generated method stub
		
	}

	//------------------------------------------------- 
	// Interface implementation:
	// 				
	//				DragGestureListener
	//
	//-------------------------------------------------
	@Override
	public void dragGestureRecognized(DragGestureEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
