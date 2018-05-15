/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'disconnect' request.
 */
@SuppressWarnings("all")
public class DisconnectArguments {
  /**
   * Indicates whether the debuggee should be terminated when the debugger is disconnected.
   * <p>
   * If unspecified, the debug adapter is free to do whatever it thinks is best.
   * <p>
   * A client can only rely on this attribute being properly honored if a debug adapter returns true for the
   * 'supportTerminateDebuggee' capability.
   * <p>
   * This is an optional property.
   */
  private Boolean terminateDebuggee;
  
  /**
   * Indicates whether the debuggee should be terminated when the debugger is disconnected.
   * <p>
   * If unspecified, the debug adapter is free to do whatever it thinks is best.
   * <p>
   * A client can only rely on this attribute being properly honored if a debug adapter returns true for the
   * 'supportTerminateDebuggee' capability.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getTerminateDebuggee() {
    return this.terminateDebuggee;
  }
  
  /**
   * Indicates whether the debuggee should be terminated when the debugger is disconnected.
   * <p>
   * If unspecified, the debug adapter is free to do whatever it thinks is best.
   * <p>
   * A client can only rely on this attribute being properly honored if a debug adapter returns true for the
   * 'supportTerminateDebuggee' capability.
   * <p>
   * This is an optional property.
   */
  public void setTerminateDebuggee(final Boolean terminateDebuggee) {
    this.terminateDebuggee = terminateDebuggee;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("terminateDebuggee", this.terminateDebuggee);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    DisconnectArguments other = (DisconnectArguments) obj;
    if (this.terminateDebuggee == null) {
      if (other.terminateDebuggee != null)
        return false;
    } else if (!this.terminateDebuggee.equals(other.terminateDebuggee))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.terminateDebuggee== null) ? 0 : this.terminateDebuggee.hashCode());
  }
}
