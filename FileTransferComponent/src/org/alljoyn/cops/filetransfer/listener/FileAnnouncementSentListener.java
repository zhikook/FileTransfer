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

import java.util.ArrayList;

/**
 * The FileAnnouncementSentListener can be utilized so the developer is notified
 * when the announce function has finished and sent an announcement to session 
 * peers. Since the announce function is executed on a separate thread (to avoid
 * hanging the application thread due to time intensive hashing of the files), the
 * user can implement this listener to be notified when the announce function has
 * finished executing. This listener returns an array containing the paths
 * of the files that failed to be announced. This listener is entirely optional and
 * will not impede normal file announcement functionality.
 * <p>
 * See {@link org.alljoyn.cops.filetransfer.FileTransferComponent#setFileAnnouncementSentListener}
 */
public interface FileAnnouncementSentListener 
{
	/**
	 * announcementSent()
	 * is triggered when the announce function has finished executing. Notifies the user
	 * which file paths, if any, failed to be announced.
	 * 
	 * @param failedPaths  array of file paths that failed to be announced
	 */
	public void announcementSent(ArrayList<String> failedPaths);
}
