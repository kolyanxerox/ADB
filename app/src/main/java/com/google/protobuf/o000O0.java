package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o000O0 extends o000O00 {
    @Override // com.google.protobuf.o000O00
    public final GeneratedMessageLite.GeneratedExtension OooO00o(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // com.google.protobuf.o000O00
    public final o00O000 OooO0O0(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.o000O00
    public final Object OooO0OO(Object obj, o000OOo o000ooo2, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, o00O000 o00o000, Object obj2, o0OO00o0 o0oo00o0) throws IOException {
        Object objValueOf;
        Object objOooO0o;
        ArrayList arrayList;
        int number = generatedExtension.getNumber();
        oo00o oo00oVar = generatedExtension.descriptor;
        if (oo00oVar.f28433OooOoO0 && oo00oVar.f28432OooOoO) {
            switch (o000O00O.f28213OooO00o[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    o000ooo2.OooO0oO(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    o000ooo2.OooOO0o(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    o000ooo2.OooOOO(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    o000ooo2.OooOo0O(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    o000ooo2.OooOOO0(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    o000ooo2.OooOO0O(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    o000ooo2.OooOO0(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    o000ooo2.OooO0Oo(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    o000ooo2.OooOo0(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    o000ooo2.OooOOOo(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    o000ooo2.OooOOo0(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    o000ooo2.OooOOo(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    o000ooo2.OooOOoo(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    o000ooo2.OooO0oo(arrayList);
                    obj2 = o0O0oo0o.OooOO0(obj, number, arrayList, generatedExtension.descriptor.f28430OooOo0O, obj2, o0oo00o0);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.f28429OooOo);
            }
            o00o000.OooOOOo(generatedExtension.descriptor, arrayList);
            return obj2;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (o000O00O.f28213OooO00o[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    o000ooo2.OooOo(1);
                    objValueOf = Double.valueOf(o000ooo2.f28219OooO00o.readDouble());
                    break;
                case 2:
                    o000ooo2.OooOo(5);
                    objValueOf = Float.valueOf(o000ooo2.f28219OooO00o.readFloat());
                    break;
                case 3:
                    o000ooo2.OooOo(0);
                    objValueOf = Long.valueOf(o000ooo2.f28219OooO00o.readInt64());
                    break;
                case 4:
                    o000ooo2.OooOo(0);
                    objValueOf = Long.valueOf(o000ooo2.f28219OooO00o.readUInt64());
                    break;
                case 5:
                    o000ooo2.OooOo(0);
                    objValueOf = Integer.valueOf(o000ooo2.f28219OooO00o.readInt32());
                    break;
                case 6:
                    o000ooo2.OooOo(1);
                    objValueOf = Long.valueOf(o000ooo2.f28219OooO00o.readFixed64());
                    break;
                case 7:
                    o000ooo2.OooOo(5);
                    objValueOf = Integer.valueOf(o000ooo2.f28219OooO00o.readFixed32());
                    break;
                case 8:
                    o000ooo2.OooOo(0);
                    objValueOf = Boolean.valueOf(o000ooo2.f28219OooO00o.readBool());
                    break;
                case 9:
                    o000ooo2.OooOo(0);
                    objValueOf = Integer.valueOf(o000ooo2.f28219OooO00o.readUInt32());
                    break;
                case 10:
                    o000ooo2.OooOo(5);
                    objValueOf = Integer.valueOf(o000ooo2.f28219OooO00o.readSFixed32());
                    break;
                case 11:
                    o000ooo2.OooOo(1);
                    objValueOf = Long.valueOf(o000ooo2.f28219OooO00o.readSFixed64());
                    break;
                case 12:
                    o000ooo2.OooOo(0);
                    objValueOf = Integer.valueOf(o000ooo2.f28219OooO00o.readSInt32());
                    break;
                case 13:
                    o000ooo2.OooOo(0);
                    objValueOf = Long.valueOf(o000ooo2.f28219OooO00o.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = o000ooo2.OooO0o0();
                    break;
                case 16:
                    o000ooo2.OooOo(2);
                    objValueOf = o000ooo2.f28219OooO00o.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object objOooO0o2 = o00o000.OooO0o(generatedExtension.descriptor);
                        if (objOooO0o2 instanceof GeneratedMessageLite) {
                            o0oO0O0o o0oo0o0oOooO0O0 = o0O00O.f28290OooO0OO.OooO0O0(objOooO0o2);
                            if (!((GeneratedMessageLite) objOooO0o2).isMutable()) {
                                Object objNewInstance = o0oo0o0oOooO0O0.newInstance();
                                o0oo0o0oOooO0O0.mergeFrom(objNewInstance, objOooO0o2);
                                o00o000.OooOOOo(generatedExtension.descriptor, objNewInstance);
                                objOooO0o2 = objNewInstance;
                            }
                            o000ooo2.OooOo(3);
                            o000ooo2.OooO0O0(objOooO0o2, o0oo0o0oOooO0O0, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                    o000ooo2.OooOo(3);
                    o0oO0O0o o0oo0o0oOooO00o = o0O00O.f28290OooO0OO.OooO00o(cls);
                    Object objNewInstance2 = o0oo0o0oOooO00o.newInstance();
                    o000ooo2.OooO0O0(objNewInstance2, o0oo0o0oOooO00o, extensionRegistryLite);
                    o0oo0o0oOooO00o.makeImmutable(objNewInstance2);
                    objValueOf = objNewInstance2;
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object objOooO0o3 = o00o000.OooO0o(generatedExtension.descriptor);
                        if (objOooO0o3 instanceof GeneratedMessageLite) {
                            o0oO0O0o o0oo0o0oOooO0O02 = o0O00O.f28290OooO0OO.OooO0O0(objOooO0o3);
                            if (!((GeneratedMessageLite) objOooO0o3).isMutable()) {
                                Object objNewInstance3 = o0oo0o0oOooO0O02.newInstance();
                                o0oo0o0oOooO0O02.mergeFrom(objNewInstance3, objOooO0o3);
                                o00o000.OooOOOo(generatedExtension.descriptor, objNewInstance3);
                                objOooO0o3 = objNewInstance3;
                            }
                            o000ooo2.OooOo(2);
                            o000ooo2.OooO0OO(objOooO0o3, o0oo0o0oOooO0O02, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    objValueOf = o000ooo2.OooOOOO(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            o000ooo2.OooOo(0);
            int int32 = o000ooo2.f28219OooO00o.readInt32();
            if (generatedExtension.descriptor.f28430OooOo0O.findValueByNumber(int32) == null) {
                return o0O0oo0o.OooOOO(obj, number, int32, obj2, o0oo00o0);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (generatedExtension.isRepeated()) {
            o00o000.OooO00o(generatedExtension.descriptor, objValueOf);
            return obj2;
        }
        int i = o000O00O.f28213OooO00o[generatedExtension.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (objOooO0o = o00o000.OooO0o(generatedExtension.descriptor)) != null) {
            objValueOf = Internal.mergeMessage(objOooO0o, objValueOf);
        }
        o00o000.OooOOOo(generatedExtension.descriptor, objValueOf);
        return obj2;
    }

    @Override // com.google.protobuf.o000O00
    public final void OooO0Oo(oO0000O oo0000o, Map.Entry entry) throws IOException {
        oo00o oo00oVar = (oo00o) entry.getKey();
        boolean z = oo00oVar.f28433OooOoO0;
        WireFormat.FieldType fieldType = oo00oVar.f28429OooOo;
        int i = oo00oVar.f28431OooOo0o;
        if (z) {
            int i2 = o000O00O.f28213OooO00o[fieldType.ordinal()];
            boolean z2 = oo00oVar.f28432OooOoO;
            switch (i2) {
                case 1:
                    o0O0oo0o.OooOOo0(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 2:
                    o0O0oo0o.OooOo0(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 3:
                    o0O0oo0o.OooOo(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 4:
                    o0O0oo0o.Oooo000(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 5:
                    o0O0oo0o.OooOo0o(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 6:
                    o0O0oo0o.OooOo00(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 7:
                    o0O0oo0o.OooOOoo(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 8:
                    o0O0oo0o.OooOOOO(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 9:
                    o0O0oo0o.OooOooo(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 10:
                    o0O0oo0o.OooOoO(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 11:
                    o0O0oo0o.OooOoOO(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 12:
                    o0O0oo0o.OooOoo0(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 13:
                    o0O0oo0o.OooOoo(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 14:
                    o0O0oo0o.OooOo0o(i, (List) entry.getValue(), oo0000o, z2);
                    break;
                case 15:
                    o0O0oo0o.OooOOOo(i, (List) entry.getValue(), oo0000o);
                    break;
                case 16:
                    o0O0oo0o.OooOooO(i, (List) entry.getValue(), oo0000o);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        o0O0oo0o.OooOo0O(i, (List) entry.getValue(), oo0000o, o0O00O.f28290OooO0OO.OooO00o(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        o0O0oo0o.OooOoO0(i, (List) entry.getValue(), oo0000o, o0O00O.f28290OooO0OO.OooO00o(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (o000O00O.f28213OooO00o[fieldType.ordinal()]) {
            case 1:
                ((o0000oo) oo0000o).f28210OooO00o.writeDouble(i, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ((o0000oo) oo0000o).f28210OooO00o.writeFloat(i, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                ((o0000oo) oo0000o).OooO0o(i, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((o0000oo) oo0000o).f28210OooO00o.writeUInt64(i, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((o0000oo) oo0000o).OooO0o0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((o0000oo) oo0000o).OooO0OO(i, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((o0000oo) oo0000o).OooO0O0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((o0000oo) oo0000o).f28210OooO00o.writeBool(i, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((o0000oo) oo0000o).f28210OooO00o.writeUInt32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((o0000oo) oo0000o).f28210OooO00o.writeSFixed32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((o0000oo) oo0000o).f28210OooO00o.writeSFixed64(i, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((o0000oo) oo0000o).f28210OooO00o.writeSInt32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((o0000oo) oo0000o).f28210OooO00o.writeSInt64(i, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((o0000oo) oo0000o).OooO0o0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((o0000oo) oo0000o).OooO00o(i, (ByteString) entry.getValue());
                break;
            case 16:
                ((o0000oo) oo0000o).f28210OooO00o.writeString(i, (String) entry.getValue());
                break;
            case 17:
                ((o0000oo) oo0000o).OooO0Oo(i, entry.getValue(), o0O00O.f28290OooO0OO.OooO00o(entry.getValue().getClass()));
                break;
            case 18:
                ((o0000oo) oo0000o).OooO0oO(i, entry.getValue(), o0O00O.f28290OooO0OO.OooO00o(entry.getValue().getClass()));
                break;
        }
    }
}
