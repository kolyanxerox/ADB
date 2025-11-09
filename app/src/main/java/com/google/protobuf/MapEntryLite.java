package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final o0o0Oo metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.metadata = new o0o0Oo(fieldType, k, fieldType2, v);
        this.key = k;
        this.value = v;
    }

    public static <K, V> int computeSerializedSize(o0o0Oo o0o0oo, K k, V v) {
        return o00O000.OooO0OO(o0o0oo.f28402OooO0OO, 2, v) + o00O000.OooO0OO(o0o0oo.f28400OooO00o, 1, k);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = o00OOO0O.f28277OooO00o[fieldType.ordinal()];
        if (i == 1) {
            MessageLite.Builder builder = ((MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i == 3) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        o00O000 o00o000 = o00O000.f28236OooO0Oo;
        return (T) WireFormat.readPrimitiveField(codedInputStream, fieldType, oO00000o.f28426OooOo0o);
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, o0o0Oo o0o0oo, K k, V v) throws IOException {
        o00O000.OooOOo(codedOutputStream, o0o0oo.f28400OooO00o, 1, k);
        o00O000.OooOOo(codedOutputStream, o0o0oo.f28402OooO0OO, 2, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v)) + CodedOutputStream.computeTagSize(i);
    }

    public K getKey() {
        return this.key;
    }

    public o0o0Oo getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        o0o0Oo o0o0oo = this.metadata;
        Object field = o0o0oo.f28401OooO0O0;
        Object field2 = o0o0oo.f28403OooO0Oo;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, this.metadata.f28400OooO00o.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, this.metadata.f28400OooO00o, field);
            } else if (tag == WireFormat.makeTag(2, this.metadata.f28402OooO0OO.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.f28402OooO0OO, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(field, field2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i, K k, V v) throws IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k, v));
        writeTo(codedOutputStream, this.metadata, k, v);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, o0o0Oo o0o0oo, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object field = o0o0oo.f28401OooO0O0;
        Object field2 = o0o0oo.f28403OooO0Oo;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            WireFormat.FieldType fieldType = o0o0oo.f28400OooO00o;
            if (tag == WireFormat.makeTag(1, fieldType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, fieldType, field);
            } else {
                WireFormat.FieldType fieldType2 = o0o0oo.f28402OooO0OO;
                if (tag == WireFormat.makeTag(2, fieldType2.getWireType())) {
                    field2 = parseField(codedInputStream, extensionRegistryLite, fieldType2, field2);
                } else if (!codedInputStream.skipField(tag)) {
                    break;
                }
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    private MapEntryLite(o0o0Oo o0o0oo, K k, V v) {
        this.metadata = o0o0oo;
        this.key = k;
        this.value = v;
    }
}
