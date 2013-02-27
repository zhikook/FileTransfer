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

package org.alljoyn.cops.filetransfer.listener;

/**
 * The UnannouncedFileRequestListener is required if the developer wishes
 * to allow session peers to request files that have not been explicitly
 * announced or shared. The default behavior is to deny all requests for
 * files that have not been announced or shared.
 * <p>
 * See {@link org.alljoyn.cops.filetransfer.FileTransferComponent#setUnannouncedFileRequestListener}
 */
public interface UnannouncedFileRequestListener 
{
	/**
	 * allowUnannouncedFileRequests()
	 * is required for use of the requestOffer() method. When a file request is received
	 * for an unannounced file, this listener is triggered. Return true to allow the request, 
	 * false to deny the request.
	 * 
	 * @param filePath  path of file being requested
	 * @return  true to accept the request, false to reject the request
	 */
	public boolean allowUnannouncedFileRequests(String filePath);
}
