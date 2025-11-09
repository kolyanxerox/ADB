package o00O0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class OooO0OO extends kotlin.jvm.internal.OooO0O0 implements ListIterator {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO f31234OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooO oooO, int i) {
        super(oooO);
        this.f31234OooOoO0 = oooO;
        OooO0O0 oooO0O0 = OooO.Companion;
        int size = oooO.size();
        oooO0O0.getClass();
        OooO0O0.OooO0O0(i, size);
        this.f28872OooOo0o = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f28872OooOo0o > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28872OooOo0o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f28872OooOo0o - 1;
        this.f28872OooOo0o = i;
        return this.f31234OooOoO0.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28872OooOo0o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
