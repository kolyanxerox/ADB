package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: classes2.dex */
public final class ListValueKt {
    public static final ListValueKt INSTANCE = new ListValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ListValue.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
                this();
            }

            public final /* synthetic */ Dsl _create(ListValue.Builder builder) {
                kotlin.jvm.internal.OooOo.OooO0o0(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class ValuesProxy extends DslProxy {
            private ValuesProxy() {
            }
        }

        public /* synthetic */ Dsl(ListValue.Builder builder, kotlin.jvm.internal.OooOO0O oooOO0O) {
            this(builder);
        }

        public final /* synthetic */ ListValue _build() {
            ListValue listValueBuild = this._builder.build();
            kotlin.jvm.internal.OooOo.OooO0Oo(listValueBuild, "_builder.build()");
            return listValueBuild;
        }

        public final /* synthetic */ void addAllValues(DslList dslList, Iterable values) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(values, "values");
            this._builder.addAllValues(values);
        }

        public final /* synthetic */ void addValues(DslList dslList, Value value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.addValues(value);
        }

        public final /* synthetic */ void clearValues(DslList dslList) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            this._builder.clearValues();
        }

        public final /* synthetic */ DslList getValues() {
            List<Value> valuesList = this._builder.getValuesList();
            kotlin.jvm.internal.OooOo.OooO0Oo(valuesList, "_builder.getValuesList()");
            return new DslList(valuesList);
        }

        public final /* synthetic */ void plusAssignAllValues(DslList<Value, ValuesProxy> dslList, Iterable<Value> values) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(values, "values");
            addAllValues(dslList, values);
        }

        public final /* synthetic */ void plusAssignValues(DslList<Value, ValuesProxy> dslList, Value value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            addValues(dslList, value);
        }

        public final /* synthetic */ void setValues(DslList dslList, int i, Value value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setValues(i, value);
        }

        private Dsl(ListValue.Builder builder) {
            this._builder = builder;
        }
    }

    private ListValueKt() {
    }
}
