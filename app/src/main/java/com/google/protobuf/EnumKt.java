package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* loaded from: classes2.dex */
public final class EnumKt {
    public static final EnumKt INSTANCE = new EnumKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Enum.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
                this();
            }

            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                kotlin.jvm.internal.OooOo.OooO0o0(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Enum.Builder builder, kotlin.jvm.internal.OooOO0O oooOO0O) {
            this(builder);
        }

        public final /* synthetic */ Enum _build() {
            Enum enumBuild = this._builder.build();
            kotlin.jvm.internal.OooOo.OooO0Oo(enumBuild, "_builder.build()");
            return enumBuild;
        }

        public final /* synthetic */ void addAllEnumvalue(DslList dslList, Iterable values) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(values, "values");
            this._builder.addAllEnumvalue(values);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addEnumvalue(DslList dslList, EnumValue value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.addEnumvalue(value);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getEdition() {
            String edition = this._builder.getEdition();
            kotlin.jvm.internal.OooOo.OooO0Oo(edition, "_builder.getEdition()");
            return edition;
        }

        public final /* synthetic */ DslList getEnumvalue() {
            List<EnumValue> enumvalueList = this._builder.getEnumvalueList();
            kotlin.jvm.internal.OooOo.OooO0Oo(enumvalueList, "_builder.getEnumvalueList()");
            return new DslList(enumvalueList);
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.OooOo.OooO0Oo(name, "_builder.getName()");
            return name;
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.OooOo.OooO0Oo(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            kotlin.jvm.internal.OooOo.OooO0Oo(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            kotlin.jvm.internal.OooOo.OooO0Oo(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, Iterable<EnumValue> values) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(values, "values");
            addAllEnumvalue(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, EnumValue value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            addEnumvalue(dslList, value);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            addOptions(dslList, value);
        }

        public final void setEdition(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setEdition(value);
        }

        public final /* synthetic */ void setEnumvalue(DslList dslList, int i, EnumValue value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setEnumvalue(i, value);
        }

        public final void setName(String value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setName(value);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option value) {
            kotlin.jvm.internal.OooOo.OooO0o0(dslList, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setOptions(i, value);
        }

        public final void setSourceContext(SourceContext value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setSourceContext(value);
        }

        public final void setSyntax(Syntax value) {
            kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
            this._builder.setSyntax(value);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumKt() {
    }
}
