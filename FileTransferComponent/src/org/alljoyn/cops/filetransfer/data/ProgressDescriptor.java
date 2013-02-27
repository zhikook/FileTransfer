/*******************************************************************************
* Copyright 2012 - 2013, Qualcomm Innovation Center, Inc.
*
*    Licensed under the Apache License, Version 2.0 (the "License");
*    you may not use this file except in compliance with the License.
*    You may obtain a copy of the License at
*
*        http://www.apache.org/licenses/LICENSE-2.0
*
*    Unless required by applicable law or agreed to in writing, software
*    distributed under the License is distributed on an "AS IS" BASIS,
*    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*    See the License for the specific language governing permissions and
*    limitations under the License.
******************************************************************************/

package org.alljoyn.cops.filetransfer.data;

/**
 * The Progress Descriptor is utilized when the user requests file transfer status
 * updates from either the sender or the receiver. This class will outline all of
 * the files that are being transferred by specifying how many bytes have already been
 * sent or received and give the total length of the file. This will allow the user to
 * see the current progress of each file transfer.
 * <p>
 * See {@link org.alljoyn.cops.filetransfer.FileTransferComponent#getSendingProgressList}
 * and {@link org.alljoyn.cops.filetransfer.FileTransferComponent#getReceiveProgressList}
 * <p>
 * Note: This class is not intended to be used directly. All of the supported
 * functionality of this library is intended to be accessed through the
 * {@link org.alljoyn.cops.filetransfer.FileTransferComponent} class.
 */
public class ProgressDescriptor 
{
	// Class Enumerator
	public enum State 
	{ 
		IN_PROGRESS, 
		PAUSED, 
		TIMED_OUT 
	}
	
	// Member Variables
	public byte[] fileID;	
	public State state;	
	public int bytesTransferred;	
	public int fileSize;
	
	/*------------------------------------------------------------------------*
     * Constructor
     *------------------------------------------------------------------------*/
	/**
	 * ProgressDescriptor()
	 * creates an instance of the ProgressDescriptor class.
	 */
	public ProgressDescriptor()
	{
		//Intentionally left blank
	}
}
