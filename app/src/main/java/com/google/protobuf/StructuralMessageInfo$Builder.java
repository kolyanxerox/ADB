package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<o00O0000> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public o0O0oo00 build() {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.syntax == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.wasBuilt = true;
        Collections.sort(this.fields);
        return new o0O0oo00(this.syntax, this.messageSetWireFormat, this.checkInitialized, (o00O0000[]) this.fields.toArray(new o00O0000[0]), this.defaultInstance);
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(o00O0000 o00o0000) {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.fields.add(o00o0000);
    }

    public void withMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat = z;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder(int i) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i);
    }
}
