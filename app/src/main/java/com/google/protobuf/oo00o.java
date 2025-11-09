package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public final class oo00o implements FieldSet$FieldDescriptorLite {

    /* renamed from: OooOo */
    public final WireFormat.FieldType f28429OooOo;

    /* renamed from: OooOo0O */
    public final Internal.EnumLiteMap f28430OooOo0O;

    /* renamed from: OooOo0o */
    public final int f28431OooOo0o;

    /* renamed from: OooOoO */
    public final boolean f28432OooOoO;

    /* renamed from: OooOoO0 */
    public final boolean f28433OooOoO0;

    public oo00o(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
        this.f28430OooOo0O = enumLiteMap;
        this.f28431OooOo0o = i;
        this.f28429OooOo = fieldType;
        this.f28433OooOoO0 = z;
        this.f28432OooOoO = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f28431OooOo0o - ((oo00o) obj).f28431OooOo0o;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final Internal.EnumLiteMap getEnumType() {
        return this.f28430OooOo0O;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.JavaType getLiteJavaType() {
        return this.f28429OooOo.getJavaType();
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.FieldType getLiteType() {
        return this.f28429OooOo;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.f28431OooOo0o;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite.Builder) messageLite);
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.f28432OooOoO;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.f28433OooOoO0;
    }
}
