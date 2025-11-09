package gatewayprotocol.p014v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o00O00Oo.o000OOo;

/* loaded from: classes3.dex */
public final class PiiOuterClass {

    public static final class Pii extends GeneratedMessageLite<Pii, Builder> implements PiiOrBuilder {
        public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
        private static final Pii DEFAULT_INSTANCE;
        public static final int FID_FIELD_NUMBER = 4;
        public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
        private static volatile Parser<Pii> PARSER = null;
        public static final int VENDOR_ID_FIELD_NUMBER = 2;
        private ByteString advertisingId_;
        private int bitField0_;
        private String fid_;
        private ByteString openAdvertisingTrackingId_;
        private ByteString vendorId_;

        public static final class Builder extends GeneratedMessageLite.Builder<Pii, Builder> implements PiiOrBuilder {
            public /* synthetic */ Builder(o000OOo o000ooo2) {
                this();
            }

            public Builder clearAdvertisingId() {
                copyOnWrite();
                ((Pii) this.instance).clearAdvertisingId();
                return this;
            }

            public Builder clearFid() {
                copyOnWrite();
                ((Pii) this.instance).clearFid();
                return this;
            }

            public Builder clearOpenAdvertisingTrackingId() {
                copyOnWrite();
                ((Pii) this.instance).clearOpenAdvertisingTrackingId();
                return this;
            }

            public Builder clearVendorId() {
                copyOnWrite();
                ((Pii) this.instance).clearVendorId();
                return this;
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getAdvertisingId() {
                return ((Pii) this.instance).getAdvertisingId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public String getFid() {
                return ((Pii) this.instance).getFid();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getFidBytes() {
                return ((Pii) this.instance).getFidBytes();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getOpenAdvertisingTrackingId() {
                return ((Pii) this.instance).getOpenAdvertisingTrackingId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public ByteString getVendorId() {
                return ((Pii) this.instance).getVendorId();
            }

            @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
            public boolean hasFid() {
                return ((Pii) this.instance).hasFid();
            }

            public Builder setAdvertisingId(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setAdvertisingId(byteString);
                return this;
            }

            public Builder setFid(String str) {
                copyOnWrite();
                ((Pii) this.instance).setFid(str);
                return this;
            }

            public Builder setFidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Pii) this.instance).setFidBytes(byteString);
                return this;
            }

            public Builder setOpenAdvertisingTrackingId(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setOpenAdvertisingTrackingId(byteString);
                return this;
            }

            public Builder setVendorId(ByteString byteString) {
                copyOnWrite();
                ((Pii) this.instance).setVendorId(byteString);
                return this;
            }

            private Builder() {
                super(Pii.DEFAULT_INSTANCE);
            }
        }

        static {
            Pii pii = new Pii();
            DEFAULT_INSTANCE = pii;
            GeneratedMessageLite.registerDefaultInstance(Pii.class, pii);
        }

        private Pii() {
            ByteString byteString = ByteString.EMPTY;
            this.advertisingId_ = byteString;
            this.vendorId_ = byteString;
            this.openAdvertisingTrackingId_ = byteString;
            this.fid_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdvertisingId() {
            this.advertisingId_ = getDefaultInstance().getAdvertisingId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFid() {
            this.bitField0_ &= -2;
            this.fid_ = getDefaultInstance().getFid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenAdvertisingTrackingId() {
            this.openAdvertisingTrackingId_ = getDefaultInstance().getOpenAdvertisingTrackingId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendorId() {
            this.vendorId_ = getDefaultInstance().getVendorId();
        }

        public static Pii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Pii parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Pii> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdvertisingId(ByteString byteString) {
            byteString.getClass();
            this.advertisingId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fid_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenAdvertisingTrackingId(ByteString byteString) {
            byteString.getClass();
            this.openAdvertisingTrackingId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorId(ByteString byteString) {
            byteString.getClass();
            this.vendorId_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            o000OOo o000ooo2 = null;
            switch (o000OOo.f31289OooO00o[methodToInvoke.ordinal()]) {
                case 1:
                    return new Pii();
                case 2:
                    return new Builder(o000ooo2);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004ለ\u0000", new Object[]{"bitField0_", "advertisingId_", "vendorId_", "openAdvertisingTrackingId_", "fid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Pii> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Pii.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getAdvertisingId() {
            return this.advertisingId_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public String getFid() {
            return this.fid_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getFidBytes() {
            return ByteString.copyFromUtf8(this.fid_);
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getOpenAdvertisingTrackingId() {
            return this.openAdvertisingTrackingId_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public ByteString getVendorId() {
            return this.vendorId_;
        }

        @Override // gatewayprotocol.v1.PiiOuterClass.PiiOrBuilder
        public boolean hasFid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Pii pii) {
            return DEFAULT_INSTANCE.createBuilder(pii);
        }

        public static Pii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Pii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Pii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Pii parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Pii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Pii parseFrom(InputStream inputStream) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PiiOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdvertisingId();

        String getFid();

        ByteString getFidBytes();

        ByteString getOpenAdvertisingTrackingId();

        ByteString getVendorId();

        boolean hasFid();
    }

    private PiiOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
