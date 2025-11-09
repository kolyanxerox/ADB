package OoooO0O;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o000O extends o00O0000 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f13954OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f13955OooOo0o;

    public o000O(Object obj) {
        this.f13954OooOo0O = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13955OooOo0o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13955OooOo0o) {
            throw new NoSuchElementException();
        }
        this.f13955OooOo0o = true;
        return this.f13954OooOo0O;
    }
}
