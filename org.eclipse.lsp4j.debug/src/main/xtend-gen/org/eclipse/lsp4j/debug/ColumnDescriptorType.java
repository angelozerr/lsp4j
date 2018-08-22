/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j.debug;

import com.google.gson.annotations.SerializedName;

/**
 * Datatype of values in this column.  Defaults to 'string' if not specified.
 */
@SuppressWarnings("all")
public enum ColumnDescriptorType {
  STRING,
  
  NUMBER,
  
  BOOLEAN,
  
  @SerializedName("unixTimestampUTC")
  UNIX_TIMESTAMP_UTC;
}
