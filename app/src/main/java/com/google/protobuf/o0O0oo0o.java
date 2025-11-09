package com.google.protobuf;

import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class o0O0oo0o {

    /* renamed from: OooO00o */
    public static final Class f28341OooO00o;

    /* renamed from: OooO0O0 */
    public static final o0OO00o0 f28342OooO0O0;

    /* renamed from: OooO0OO */
    public static final o0OO0 f28343OooO0OO;

    static {
        Class<?> cls;
        Class<?> cls2;
        o0OO00o0 o0oo00o0 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f28341OooO00o = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                o0oo00o0 = (o0OO00o0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f28342OooO0O0 = o0oo00o0;
        f28343OooO0OO = new o0OO0();
    }

    public static int OooO(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oo0O)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return iComputeUInt64SizeNoTag;
        }
        oo0O oo0o = (oo0O) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(oo0o.getLong(i));
            i++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static int OooO00o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o00O0O0)) {
            int iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return iComputeEnumSizeNoTag;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(o00o0o0.getInt(i));
            i++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int OooO0O0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i, 0) * size;
    }

    public static int OooO0OO(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i, 0L) * size;
    }

    public static int OooO0Oo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o00O0O0)) {
            int iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return iComputeInt32SizeNoTag;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(o00o0o0.getInt(i));
            i++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int OooO0o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o00O0O0)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return iComputeSInt32SizeNoTag;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(o00o0o0.getInt(i));
            i++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int OooO0o0(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oo0O)) {
            int iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return iComputeInt64SizeNoTag;
        }
        oo0O oo0o = (oo0O) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(oo0o.getLong(i));
            i++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int OooO0oO(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oo0O)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return iComputeSInt64SizeNoTag;
        }
        oo0O oo0o = (oo0O) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(oo0o.getLong(i));
            i++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int OooO0oo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o00O0O0)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return iComputeUInt32SizeNoTag;
        }
        o00O0O0 o00o0o0 = (o00O0O0) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(o00o0o0.getInt(i));
            i++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static Object OooOO0(Object obj, int i, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, o0OO00o0 o0oo00o0) {
        if (enumLiteMap == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj2 = OooOOO(obj, i, iIntValue, obj2, o0oo00o0);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object OooOO0O(Object obj, int i, List list, Internal.EnumVerifier enumVerifier, Object obj2, o0OO00o0 o0oo00o0) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(iIntValue)) {
                    obj2 = OooOOO(obj, i, iIntValue, obj2, o0oo00o0);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (enumVerifier.isInRange(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = OooOOO(obj, i, iIntValue2, obj2, o0oo00o0);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void OooOO0o(o0OO00o0 o0oo00o0, Object obj, Object obj2) {
        ((o0OO0) o0oo00o0).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLiteMutableCopyOf = generatedMessageLite.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj2).unknownFields;
        if (!UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
            unknownFieldSetLiteMutableCopyOf = UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLiteMutableCopyOf) ? UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLiteMutableCopyOf, unknownFieldSetLite) : unknownFieldSetLiteMutableCopyOf.mergeFrom(unknownFieldSetLite);
        }
        generatedMessageLite.unknownFields = unknownFieldSetLiteMutableCopyOf;
    }

    public static Object OooOOO(Object obj, int i, int i2, Object obj2, o0OO00o0 o0oo00o0) {
        if (obj2 == null) {
            obj2 = o0oo00o0.OooO00o(obj);
        }
        ((o0OO0) o0oo00o0).getClass();
        ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i, 0), Long.valueOf(i2));
        return obj2;
    }

    public static boolean OooOOO0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void OooOOOO(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeBool(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i3)).booleanValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeBoolNoTag(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public static void OooOOOo(int i, List list, oO0000O oo0000o) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000oo o0000ooVar = (o0000oo) oo0000o;
        o0000ooVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0000ooVar.f28210OooO00o.writeBytes(i, (ByteString) list.get(i2));
        }
    }

    public static void OooOOo(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeEnum(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeEnumNoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOOo0(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeDouble(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i3)).doubleValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeDoubleNoTag(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public static void OooOOoo(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOo(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOo0(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFloat(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i3)).floatValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeFloatNoTag(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public static void OooOo00(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeFixed64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOo0O(int i, List list, oO0000O oo0000o, o0oO0O0o o0oo0o0o) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000oo o0000ooVar = (o0000oo) oo0000o;
        o0000ooVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0000ooVar.OooO0Oo(i, list.get(i2), o0oo0o0o);
        }
    }

    public static void OooOo0o(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOoO(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeSFixed32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOoO0(int i, List list, oO0000O oo0000o, o0oO0O0o o0oo0o0o) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000oo o0000ooVar = (o0000oo) oo0000o;
        o0000ooVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0000ooVar.OooO0oO(i, list.get(i2), o0oo0o0o);
        }
    }

    public static void OooOoOO(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSFixed64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeSFixed64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOoo(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeSInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOoo0(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeSInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeSInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOooO(int i, List list, oO0000O oo0000o) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000oo o0000ooVar = (o0000oo) oo0000o;
        o0000ooVar.getClass();
        boolean z = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = o0000ooVar.f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeString(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i2 < list.size()) {
            Object raw = lazyStringList.getRaw(i2);
            if (raw instanceof String) {
                codedOutputStream.writeString(i, (String) raw);
            } else {
                codedOutputStream.writeBytes(i, (ByteString) raw);
            }
            i2++;
        }
    }

    public static void OooOooo(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeUInt32(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void Oooo000(int i, List list, oO0000O oo0000o, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((o0000oo) oo0000o).f28210OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.writeUInt64(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.writeTag(i, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i2 < list.size()) {
            codedOutputStream.writeUInt64NoTag(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
