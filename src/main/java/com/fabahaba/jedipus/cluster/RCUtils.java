package com.fabahaba.jedipus.cluster;

public final class RCUtils {

  private RCUtils() {}

  public static String createHashTag(final String shardKey) {

    return "{" + shardKey + "}";
  }

  public static final String NAMESPACE_DELIMITER = ":";

  public static String createNameSpacedHashTag(final String shardKey) {

    return createNameSpacedHashTag(shardKey, NAMESPACE_DELIMITER);
  }

  public static String createNameSpacedHashTag(final String shardKey,
      final String namespaceDelimiter) {

    return "{" + shardKey + "}" + namespaceDelimiter;
  }
}
