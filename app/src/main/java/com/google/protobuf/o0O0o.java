package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0O0o implements o0oO0O0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final MessageLite f28329OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00o0 f28330OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f28331OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O00 f28332OooO0Oo;

    public o0O0o(o0OO00o0 o0oo00o0, o000O00 o000o002, MessageLite messageLite) {
        this.f28330OooO0O0 = o0oo00o0;
        ((o000O0) o000o002).getClass();
        this.f28331OooO0OO = messageLite instanceof GeneratedMessageLite.ExtendableMessage;
        this.f28332OooO0Oo = o000o002;
        this.f28329OooO00o = messageLite;
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final void OooO00o(MessageLite messageLite, oO0000O oo0000o) throws IOException {
        ((o000O0) this.f28332OooO0Oo).getClass();
        Iterator itOooOO0o = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.OooOO0o();
        while (itOooOO0o.hasNext()) {
            Map.Entry entry = (Map.Entry) itOooOO0o.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
            if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof o00O0OOO) {
                ((o0000oo) oo0000o).OooO0oo(fieldSet$FieldDescriptorLite.getNumber(), ((LazyField) ((o00O0OOO) entry).f28268OooOo0O.getValue()).toByteString());
            } else {
                ((o0000oo) oo0000o).OooO0oo(fieldSet$FieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        ((o0OO0) this.f28330OooO0O0).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeAsMessageSetTo(oo0000o);
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final int OooO0O0(AbstractMessageLite abstractMessageLite) {
        ((o0OO0) this.f28330OooO0O0).getClass();
        int serializedSizeAsMessageSet = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSizeAsMessageSet();
        if (!this.f28331OooO0OO) {
            return serializedSizeAsMessageSet;
        }
        ((o000O0) this.f28332OooO0Oo).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.OooO0oO() + serializedSizeAsMessageSet;
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final void OooO0OO(Object obj, o000OOo o000ooo2, ExtensionRegistryLite extensionRegistryLite) {
        o0OO00o0 o0oo00o0 = this.f28330OooO0O0;
        UnknownFieldSetLite unknownFieldSetLiteOooO00o = o0oo00o0.OooO00o(obj);
        o000O00 o000o002 = this.f28332OooO0Oo;
        ((o000O0) o000o002).getClass();
        o00O000 o00o000EnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (o000ooo2.OooO00o() != Integer.MAX_VALUE) {
            try {
                o000OOo o000ooo3 = o000ooo2;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!OooO0oO(o000ooo3, extensionRegistryLite2, o000o002, o00o000EnsureExtensionsAreMutable, o0oo00o0, unknownFieldSetLiteOooO00o)) {
                    break;
                }
                o000ooo2 = o000ooo3;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLiteOooO00o;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    @Override // com.google.protobuf.o0oO0O0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.protobuf.OooOO0O r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o0O0o.OooO0Oo(java.lang.Object, byte[], int, int, com.google.protobuf.OooOO0O):void");
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final boolean OooO0o(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        o0OO0 o0oo0 = (o0OO0) this.f28330OooO0O0;
        o0oo0.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        o0oo0.getClass();
        if (!unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.f28331OooO0OO) {
            return true;
        }
        o000O0 o000o0 = (o000O0) this.f28332OooO0Oo;
        o000o0.getClass();
        o00O000 o00o000 = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
        o000o0.getClass();
        return o00o000.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final int OooO0o0(GeneratedMessageLite generatedMessageLite) {
        ((o0OO0) this.f28330OooO0O0).getClass();
        int iHashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.f28331OooO0OO) {
            return iHashCode;
        }
        ((o000O0) this.f28332OooO0Oo).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f28237OooO00o.hashCode() + (iHashCode * 53);
    }

    public final boolean OooO0oO(o000OOo o000ooo2, ExtensionRegistryLite extensionRegistryLite, o000O00 o000o002, o00O000 o00o000, o0OO00o0 o0oo00o0, UnknownFieldSetLite unknownFieldSetLite) throws IOException {
        int i = o000ooo2.f28220OooO0O0;
        int i2 = WireFormat.MESSAGE_SET_ITEM_TAG;
        MessageLite messageLite = this.f28329OooO00o;
        if (i != i2) {
            if (WireFormat.getTagWireType(i) != 2) {
                return o000ooo2.OooOoO0();
            }
            int tagFieldNumber = WireFormat.getTagFieldNumber(i);
            o000O0 o000o0 = (o000O0) o000o002;
            o000o0.getClass();
            GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber);
            if (generatedExtensionFindLiteExtensionByNumber == null) {
                return o0oo00o0.OooO0O0(0, o000ooo2, unknownFieldSetLite);
            }
            o000o0.getClass();
            o00o000.OooOOOo(generatedExtensionFindLiteExtensionByNumber.descriptor, o000ooo2.OooOOOO(generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().getClass(), extensionRegistryLite));
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber2 = null;
        ByteString byteStringOooO0o0 = null;
        int uInt32 = 0;
        while (o000ooo2.OooO00o() != Integer.MAX_VALUE) {
            int i3 = o000ooo2.f28220OooO0O0;
            if (i3 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                o000ooo2.OooOo(0);
                uInt32 = o000ooo2.f28219OooO00o.readUInt32();
                ((o000O0) o000o002).getClass();
                generatedExtensionFindLiteExtensionByNumber2 = extensionRegistryLite.findLiteExtensionByNumber(messageLite, uInt32);
            } else if (i3 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (generatedExtensionFindLiteExtensionByNumber2 != null) {
                    ((o000O0) o000o002).getClass();
                    o00o000.OooOOOo(generatedExtensionFindLiteExtensionByNumber2.descriptor, o000ooo2.OooOOOO(generatedExtensionFindLiteExtensionByNumber2.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                } else {
                    byteStringOooO0o0 = o000ooo2.OooO0o0();
                }
            } else if (!o000ooo2.OooOoO0()) {
                break;
            }
        }
        if (o000ooo2.f28220OooO0O0 != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringOooO0o0 != null) {
            if (generatedExtensionFindLiteExtensionByNumber2 != null) {
                ((o000O0) o000o002).getClass();
                MessageLite.Builder builderNewBuilderForType = generatedExtensionFindLiteExtensionByNumber2.getMessageDefaultInstance().newBuilderForType();
                CodedInputStream codedInputStreamNewCodedInput = byteStringOooO0o0.newCodedInput();
                builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
                o00o000.OooOOOo(generatedExtensionFindLiteExtensionByNumber2.descriptor, builderNewBuilderForType.buildPartial());
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return true;
            }
            ((o0OO0) o0oo00o0).getClass();
            unknownFieldSetLite.storeField(WireFormat.makeTag(uInt32, 2), byteStringOooO0o0);
        }
        return true;
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final boolean isInitialized(Object obj) {
        ((o000O0) this.f28332OooO0Oo).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.OooOO0();
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final void makeImmutable(Object obj) {
        ((o0OO0) this.f28330OooO0O0).getClass();
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
        ((o000O0) this.f28332OooO0Oo).getClass();
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.OooOOO0();
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final void mergeFrom(Object obj, Object obj2) {
        o0O0oo0o.OooOO0o(this.f28330OooO0O0, obj, obj2);
        if (this.f28331OooO0OO) {
            ((o000O0) this.f28332OooO0Oo).getClass();
            o00O000 o00o000 = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (o00o000.f28237OooO00o.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().OooOOO(o00o000);
        }
    }

    @Override // com.google.protobuf.o0oO0O0o
    public final Object newInstance() {
        MessageLite messageLite = this.f28329OooO00o;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).newMutableInstance() : messageLite.newBuilderForType().buildPartial();
    }
}
