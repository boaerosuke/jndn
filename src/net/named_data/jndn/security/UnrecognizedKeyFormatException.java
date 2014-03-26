/**
 * Copyright (C) 2014 Regents of the University of California.
 * @author: Jeff Thompson <jefft0@remap.ucla.edu>
 * See COPYING for copyright and distribution information.
 */

package net.named_data.jndn.security;

public class UnrecognizedKeyFormatException extends SecurityException {
  public UnrecognizedKeyFormatException(String message) 
  {
    super(message);
  }
}