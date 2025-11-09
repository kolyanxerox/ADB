package com.google.protobuf;

import com.google.android.gms.internal.measurement.oO0O00o0;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o00O000 {

    /* renamed from: OooO0Oo */
    public static final o00O000 f28236OooO0Oo = new o00O000(0);

    /* renamed from: OooO00o */
    public final o0O0O0Oo f28237OooO00o = new o0O0O0Oo(16);

    /* renamed from: OooO0O0 */
    public boolean f28238OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f28239OooO0OO;

    public o00O000() {
    }

    public static int OooO0OO(WireFormat.FieldType fieldType, int i, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return OooO0Oo(fieldType, obj) + iComputeTagSize;
    }

    public static int OooO0Oo(WireFormat.FieldType fieldType, Object obj) {
        switch (o00oOoo.f28284OooO0O0[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int OooO0o0(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            return OooO0OO(liteType, number, obj);
        }
        List list = (List) obj;
        int iOooO0OO = 0;
        if (!fieldSet$FieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iOooO0OO += OooO0OO(liteType, number, it.next());
            }
            return iOooO0OO;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iOooO0OO += OooO0Oo(liteType, it2.next());
        }
        return CodedOutputStream.computeUInt32SizeNoTag(iOooO0OO) + CodedOutputStream.computeTagSize(number) + iOooO0OO;
    }

    public static int OooO0oo(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        return (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) ? OooO0o0(fieldSet$FieldDescriptorLite, value) : value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public static boolean OooOO0O(Map.Entry entry) {
        boolean zIsInitialized;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (!fieldSet$FieldDescriptorLite.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof MessageLiteOrBuilder) {
                    zIsInitialized = ((MessageLiteOrBuilder) obj).isInitialized();
                } else {
                    if (!(obj instanceof LazyField)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void OooOOo(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, fieldType.getWireType());
            OooOOoo(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooOOo0(com.google.protobuf.FieldSet$FieldDescriptorLite r3, java.lang.Object r4) {
        /*
            com.google.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            com.google.protobuf.Internal.checkNotNull(r4)
            int[] r1 = com.google.protobuf.o00oOoo.f28283OooO00o
            com.google.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L46
        L1a:
            boolean r0 = r4 instanceof com.google.protobuf.MessageLite
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.protobuf.LazyField
            if (r0 == 0) goto L18
            goto L46
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.protobuf.Internal.EnumLite
            if (r0 == 0) goto L18
            goto L46
        L2c:
            boolean r0 = r4 instanceof com.google.protobuf.ByteString
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L46
        L35:
            boolean r1 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r1 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r1 = r4 instanceof java.lang.Integer
        L46:
            if (r1 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.getNumber()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
            com.google.protobuf.WireFormat$JavaType r3 = r3.getJavaType()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o00O000.OooOOo0(com.google.protobuf.FieldSet$FieldDescriptorLite, java.lang.Object):void");
    }

    public static void OooOOoo(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (o00oOoo.f28284OooO0O0[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    break;
                }
        }
    }

    public final int OooO() {
        o0O0O0Oo o0o0o0oo;
        int i = 0;
        int iOooO0o0 = 0;
        while (true) {
            o0o0o0oo = this.f28237OooO00o;
            if (i >= o0o0o0oo.f28320OooOo0o.size()) {
                break;
            }
            Map.Entry entryOooO0OO = o0o0o0oo.OooO0OO(i);
            iOooO0o0 += OooO0o0((FieldSet$FieldDescriptorLite) entryOooO0OO.getKey(), entryOooO0OO.getValue());
            i++;
        }
        for (Map.Entry entry : o0o0o0oo.OooO0Oo()) {
            iOooO0o0 += OooO0o0((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iOooO0o0;
    }

    public final void OooO00o(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        List arrayList;
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        OooOOo0(fieldSet$FieldDescriptorLite, obj);
        Object objOooO0o = OooO0o(fieldSet$FieldDescriptorLite);
        if (objOooO0o == null) {
            arrayList = new ArrayList();
            this.f28237OooO00o.put(fieldSet$FieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objOooO0o;
        }
        arrayList.add(obj);
    }

    /* renamed from: OooO0O0 */
    public final o00O000 clone() {
        o0O0O0Oo o0o0o0oo;
        o00O000 o00o000 = new o00O000();
        int i = 0;
        while (true) {
            o0o0o0oo = this.f28237OooO00o;
            if (i >= o0o0o0oo.f28320OooOo0o.size()) {
                break;
            }
            Map.Entry entryOooO0OO = o0o0o0oo.OooO0OO(i);
            o00o000.OooOOOo((FieldSet$FieldDescriptorLite) entryOooO0OO.getKey(), entryOooO0OO.getValue());
            i++;
        }
        for (Map.Entry entry : o0o0o0oo.OooO0Oo()) {
            o00o000.OooOOOo((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        o00o000.f28239OooO0OO = this.f28239OooO0OO;
        return o00o000;
    }

    public final Object OooO0o(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj = this.f28237OooO00o.get(fieldSet$FieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final int OooO0oO() {
        o0O0O0Oo o0o0o0oo;
        int i = 0;
        int iOooO0oo = 0;
        while (true) {
            o0o0o0oo = this.f28237OooO00o;
            if (i >= o0o0o0oo.f28320OooOo0o.size()) {
                break;
            }
            iOooO0oo += OooO0oo(o0o0o0oo.OooO0OO(i));
            i++;
        }
        Iterator it = o0o0o0oo.OooO0Oo().iterator();
        while (it.hasNext()) {
            iOooO0oo += OooO0oo((Map.Entry) it.next());
        }
        return iOooO0oo;
    }

    public final boolean OooOO0() {
        int i = 0;
        while (true) {
            o0O0O0Oo o0o0o0oo = this.f28237OooO00o;
            if (i >= o0o0o0oo.f28320OooOo0o.size()) {
                Iterator it = o0o0o0oo.OooO0Oo().iterator();
                while (it.hasNext()) {
                    if (!OooOO0O((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!OooOO0O(o0o0o0oo.OooO0OO(i))) {
                return false;
            }
            i++;
        }
    }

    public final Iterator OooOO0o() {
        boolean z = this.f28239OooO0OO;
        o0O0O0Oo o0o0o0oo = this.f28237OooO00o;
        return z ? new oo0oOO0(((oO0O00o0) o0o0o0oo.entrySet()).iterator()) : ((oO0O00o0) o0o0o0oo.entrySet()).iterator();
    }

    public final void OooOOO(o00O000 o00o000) {
        o0O0O0Oo o0o0o0oo;
        int i = 0;
        while (true) {
            int size = o00o000.f28237OooO00o.f28320OooOo0o.size();
            o0o0o0oo = o00o000.f28237OooO00o;
            if (i >= size) {
                break;
            }
            OooOOOO(o0o0o0oo.OooO0OO(i));
            i++;
        }
        Iterator it = o0o0o0oo.OooO0Oo().iterator();
        while (it.hasNext()) {
            OooOOOO((Map.Entry) it.next());
        }
    }

    public final void OooOOO0() {
        o0O0O0Oo o0o0o0oo;
        if (this.f28238OooO0O0) {
            return;
        }
        int i = 0;
        while (true) {
            o0o0o0oo = this.f28237OooO00o;
            if (i >= o0o0o0oo.f28320OooOo0o.size()) {
                break;
            }
            Map.Entry entryOooO0OO = o0o0o0oo.OooO0OO(i);
            if (entryOooO0OO.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryOooO0OO.getValue()).makeImmutable();
            }
            i++;
        }
        if (!o0o0o0oo.f28322OooOoO0) {
            for (int i2 = 0; i2 < o0o0o0oo.f28320OooOo0o.size(); i2++) {
                Map.Entry entryOooO0OO2 = o0o0o0oo.OooO0OO(i2);
                if (((FieldSet$FieldDescriptorLite) entryOooO0OO2.getKey()).isRepeated()) {
                    entryOooO0OO2.setValue(Collections.unmodifiableList((List) entryOooO0OO2.getValue()));
                }
            }
            for (Map.Entry entry : o0o0o0oo.OooO0Oo()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!o0o0o0oo.f28322OooOoO0) {
            o0o0o0oo.f28318OooOo = o0o0o0oo.f28318OooOo.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o0o0o0oo.f28318OooOo);
            o0o0o0oo.f28323OooOoOO = o0o0o0oo.f28323OooOoOO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o0o0o0oo.f28323OooOoOO);
            o0o0o0oo.f28322OooOoO0 = true;
        }
        this.f28238OooO0O0 = true;
    }

    public final void OooOOOO(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean zIsRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        o0O0O0Oo o0o0o0oo = this.f28237OooO00o;
        if (zIsRepeated) {
            Object objOooO0o = OooO0o(fieldSet$FieldDescriptorLite);
            if (objOooO0o == null) {
                objOooO0o = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objOooO0o;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            o0o0o0oo.put(fieldSet$FieldDescriptorLite, objOooO0o);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            o0o0o0oo.put(fieldSet$FieldDescriptorLite, value);
            return;
        }
        Object objOooO0o2 = OooO0o(fieldSet$FieldDescriptorLite);
        if (objOooO0o2 != null) {
            o0o0o0oo.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) objOooO0o2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        o0o0o0oo.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void OooOOOo(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            OooOOo0(fieldSet$FieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                OooOOo0(fieldSet$FieldDescriptorLite, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f28239OooO0OO = true;
        }
        this.f28237OooO00o.put(fieldSet$FieldDescriptorLite, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O000) {
            return this.f28237OooO00o.equals(((o00O000) obj).f28237OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28237OooO00o.hashCode();
    }

    public o00O000(int i) {
        OooOOO0();
        OooOOO0();
    }
}
