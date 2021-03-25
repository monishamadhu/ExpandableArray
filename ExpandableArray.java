package week6;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class ExpandableArray extends ConsoleProgram {
	
		/**
		* Creates a new expandable array with no elements.
		*/
		public ExpandableArray() {
			//arr = new ArrayList<Object>();
			objArr = new Object[0];
		}
		/**
		* Sets the element at the given index position to the specified.
		* value. If the internal array is not large enough to contain that
		* element, the implementation expands the array to make room.
		*/
		public void set(int index, Object value) {
			//arr.add(index, value);
			if(index >= objArr.length) {
				Object[] newObjArr = new Object[index+1];// creating a new array with length (index+1)
				for(int i = 0; i<newObjArr.length; i++) {
					newObjArr[i] = objArr[i];
				}
				objArr = newObjArr;
			}
			objArr[index] = value;
		}
		/**
		* Returns the element at the specified index position, or null if
		* no such element exists. Note that this method never throws an
		* out-of-bounds exception; if the index is outside the bounds of
		* the array, the return value is simply null.
		*/
		public Object get(int index) {
			/*if(index<arr.size()) {
				return (arr.get(index));
			} else {
				return null;
			}*/
			if(index < objArr.length) {
				return objArr[index];
			}else {
				return null;
			}
		}
		
		//ArrayList<Object> arr;
		Object[] objArr;
}
