/*
 * Copyright 2002-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.io.filefilter;

import java.util.List;

/**
 * Defines operations for conditional file filters.
 *
 * @since Commons IO 1.0
 * @version $Revision: 1.1 $ $Date: 2004/10/24 21:58:44 $
 *
 * @author  Steven Caswell
 */
public interface ConditionalFileFilter
{
  /**
   * Adds the specified file filter to the list of file filters at the end of
   * the list.
   *
   * @param ioFileFilter the filter to be added
   */
  public void addFileFilter(IOFileFilter ioFileFilter);

  /**
   * Returns this conditional file filter's list of file filters.
   *
   * @return the file filter list
   */
  public List getFileFilters();
  
  /**
   * Removes the specified file filter.
   *
   * @param ioFileFilter filter to be removed
   * @return <code>true</code> if the filter was found in the list,
   * <code>false</code> otherwise
   */
  public boolean removeFileFilter(IOFileFilter ioFileFilter);

  /**
   * Sets the list of file filters, replacing any previously configured
   * file filters on this filter.
   *
   * @param fileFilters the list of filters
   */
  public void setFileFilters(List fileFilters);
  
}