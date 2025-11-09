package com.google.protobuf.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(Collection<? extends E> delegate) {
        super(delegate);
        OooOo.OooO0o0(delegate, "delegate");
    }
}
