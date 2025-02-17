// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyManagerRest.proto

package br.com.zup.edu;

/**
 * Protobuf enum {@code br.com.zup.edu.TipoDeConta}
 */
public enum TipoDeConta
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONTA_DESCONHECIDA = 0;</code>
   */
  CONTA_DESCONHECIDA(0),
  /**
   * <code>CONTA_POUPANCA = 1;</code>
   */
  CONTA_POUPANCA(1),
  /**
   * <code>CONTA_CORRENTE = 2;</code>
   */
  CONTA_CORRENTE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONTA_DESCONHECIDA = 0;</code>
   */
  public static final int CONTA_DESCONHECIDA_VALUE = 0;
  /**
   * <code>CONTA_POUPANCA = 1;</code>
   */
  public static final int CONTA_POUPANCA_VALUE = 1;
  /**
   * <code>CONTA_CORRENTE = 2;</code>
   */
  public static final int CONTA_CORRENTE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TipoDeConta valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TipoDeConta forNumber(int value) {
    switch (value) {
      case 0: return CONTA_DESCONHECIDA;
      case 1: return CONTA_POUPANCA;
      case 2: return CONTA_CORRENTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TipoDeConta>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TipoDeConta> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TipoDeConta>() {
          public TipoDeConta findValueByNumber(int number) {
            return TipoDeConta.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return br.com.zup.edu.KeyManagerRest.getDescriptor().getEnumTypes().get(1);
  }

  private static final TipoDeConta[] VALUES = values();

  public static TipoDeConta valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TipoDeConta(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:br.com.zup.edu.TipoDeConta)
}

