package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* loaded from: classes2.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                kotlin.jvm.internal.OooOo.OooO0o0(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Any.Builder builder, kotlin.jvm.internal.OooOO0O oooOO0O) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            Any anyBuild = this._builder.build();
            kotlin.jvm.internal.OooOo.OooO0Oo(anyBuild, "_builder.build()");
            return anyBuild;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.OooOo.OooO0Oo(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            kotlin.jvm.internal.OooOo.OooO0Oo(value, "_builder.getValue()");
            return value;
        }

        public final void setTypeUrl(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setTypeUrl(value);
        }

        public final void setValue(ByteString value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setValue(value);
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }
    }

    private AnyKt() {
    }
}
