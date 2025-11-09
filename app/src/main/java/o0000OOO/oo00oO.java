package o0000Ooo;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class oo00oO extends o0O000Oo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f29563OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f29564OooOo0o;

    public oo00oO(Object obj) {
        this.f29564OooOo0o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f29563OooOo0O;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f29563OooOo0O) {
            throw new NoSuchElementException();
        }
        this.f29563OooOo0O = true;
        return this.f29564OooOo0o;
    }
}
