package com.fabahaba.jedipus.exceptions;

import com.fabahaba.jedipus.cluster.Node;

@SuppressWarnings("serial")
public class SlotMovedException extends SlotRedirectException {

  public SlotMovedException(final Node node, final Throwable cause,
      final Node targetNode, final int slot) {
    super(node, cause, targetNode, slot);
  }

  public SlotMovedException(final Node node, final String message, final Throwable cause,
      final Node targetNode, final int slot) {
    super(node, message, cause, targetNode, slot);
  }

  public SlotMovedException(final Node node, final String message,
      final Node targetNode, final int slot) {
    super(node, message, targetNode, slot);
  }
}
