package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class FieldInfo$Builder {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private Internal.EnumVerifier enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private o0O00 oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private FieldType type;

    public /* synthetic */ FieldInfo$Builder(o00 o00Var) {
        this();
    }

    public o00O0000 build() {
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            java.lang.reflect.Field field = this.field;
            int i = this.fieldNumber;
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            Internal.checkNotNull(obj, "mapDefaultEntry");
            o00O0000.OooO00o(i);
            Internal.checkNotNull(field, "field");
            return new o00O0000(field, i, FieldType.MAP, null, 0, false, true, obj, enumVerifier, null);
        }
        java.lang.reflect.Field field2 = this.presenceField;
        if (field2 != null) {
            if (this.required) {
                java.lang.reflect.Field field3 = this.field;
                int i2 = this.fieldNumber;
                FieldType fieldType = this.type;
                int i3 = this.presenceMask;
                boolean z = this.enforceUtf8;
                Internal.EnumVerifier enumVerifier2 = this.enumVerifier;
                o00O0000.OooO00o(i2);
                Internal.checkNotNull(field3, "field");
                Internal.checkNotNull(fieldType, "fieldType");
                Internal.checkNotNull(field2, "presenceField");
                if (i3 == 0 || ((i3 - 1) & i3) != 0) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i3, "presenceMask must have exactly one bit set: "));
                }
                return new o00O0000(field3, i2, fieldType, field2, i3, true, z, null, enumVerifier2, null);
            }
            java.lang.reflect.Field field4 = this.field;
            int i4 = this.fieldNumber;
            FieldType fieldType2 = this.type;
            int i5 = this.presenceMask;
            boolean z2 = this.enforceUtf8;
            Internal.EnumVerifier enumVerifier3 = this.enumVerifier;
            o00O0000.OooO00o(i4);
            Internal.checkNotNull(field4, "field");
            Internal.checkNotNull(fieldType2, "fieldType");
            Internal.checkNotNull(field2, "presenceField");
            if (i5 == 0 || ((i5 - 1) & i5) != 0) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i5, "presenceMask must have exactly one bit set: "));
            }
            return new o00O0000(field4, i4, fieldType2, field2, i5, false, z2, null, enumVerifier3, null);
        }
        Internal.EnumVerifier enumVerifier4 = this.enumVerifier;
        if (enumVerifier4 != null) {
            java.lang.reflect.Field field5 = this.cachedSizeField;
            if (field5 == null) {
                java.lang.reflect.Field field6 = this.field;
                int i6 = this.fieldNumber;
                FieldType fieldType3 = this.type;
                o00O0000.OooO00o(i6);
                Internal.checkNotNull(field6, "field");
                return new o00O0000(field6, i6, fieldType3, null, 0, false, false, null, enumVerifier4, null);
            }
            java.lang.reflect.Field field7 = this.field;
            int i7 = this.fieldNumber;
            FieldType fieldType4 = this.type;
            o00O0000.OooO00o(i7);
            Internal.checkNotNull(field7, "field");
            return new o00O0000(field7, i7, fieldType4, null, 0, false, false, null, enumVerifier4, field5);
        }
        java.lang.reflect.Field field8 = this.cachedSizeField;
        if (field8 != null) {
            java.lang.reflect.Field field9 = this.field;
            int i8 = this.fieldNumber;
            FieldType fieldType5 = this.type;
            o00O0000.OooO00o(i8);
            Internal.checkNotNull(field9, "field");
            Internal.checkNotNull(fieldType5, "fieldType");
            if (fieldType5 == FieldType.MESSAGE_LIST || fieldType5 == FieldType.GROUP_LIST) {
                throw new IllegalStateException("Shouldn't be called for repeated message fields.");
            }
            return new o00O0000(field9, i8, fieldType5, null, 0, false, false, null, null, field8);
        }
        java.lang.reflect.Field field10 = this.field;
        int i9 = this.fieldNumber;
        FieldType fieldType6 = this.type;
        boolean z3 = this.enforceUtf8;
        o00O0000.OooO00o(i9);
        Internal.checkNotNull(field10, "field");
        Internal.checkNotNull(fieldType6, "fieldType");
        if (fieldType6 == FieldType.MESSAGE_LIST || fieldType6 == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new o00O0000(field10, i9, fieldType6, null, 0, false, z3, null, null, null);
    }

    public FieldInfo$Builder withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public FieldInfo$Builder withEnforceUtf8(boolean z) {
        this.enforceUtf8 = z;
        return this;
    }

    public FieldInfo$Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
        this.enumVerifier = enumVerifier;
        return this;
    }

    public FieldInfo$Builder withField(java.lang.reflect.Field field) {
        this.field = field;
        return this;
    }

    public FieldInfo$Builder withFieldNumber(int i) {
        this.fieldNumber = i;
        return this;
    }

    public FieldInfo$Builder withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public FieldInfo$Builder withOneof(o0O00 o0o00, Class<?> cls) {
        if (this.field != null || this.presenceField != null) {
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }
        this.oneofStoredType = cls;
        return this;
    }

    public FieldInfo$Builder withPresence(java.lang.reflect.Field field, int i) {
        this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
        this.presenceMask = i;
        return this;
    }

    public FieldInfo$Builder withRequired(boolean z) {
        this.required = z;
        return this;
    }

    public FieldInfo$Builder withType(FieldType fieldType) {
        this.type = fieldType;
        return this;
    }

    private FieldInfo$Builder() {
    }
}
