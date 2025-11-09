package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0OoOo0 implements Iterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f26643OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26644OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f26645OooOo0o;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f26644OooOo0O = i;
        this.f26643OooOo = obj;
        this.f26645OooOo0o = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26644OooOo0O) {
            case 0:
                if (this.f26645OooOo0o < ((o00O0O) this.f26643OooOo).f26532OooOo0O.length()) {
                }
                break;
            case 1:
                if (this.f26645OooOo0o < ((o00O0O) this.f26643OooOo).f26532OooOo0O.length()) {
                }
                break;
            default:
                if (this.f26645OooOo0o < ((OooO0o) this.f26643OooOo).OooOO0()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f26644OooOo0O) {
            case 0:
                String str = ((o00O0O) this.f26643OooOo).f26532OooOo0O;
                int i = this.f26645OooOo0o;
                if (i >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f26645OooOo0o = i + 1;
                return new o00O0O(String.valueOf(i));
            case 1:
                o00O0O o00o0o = (o00O0O) this.f26643OooOo;
                String str2 = o00o0o.f26532OooOo0O;
                int i2 = this.f26645OooOo0o;
                if (i2 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f26645OooOo0o = i2 + 1;
                return new o00O0O(String.valueOf(o00o0o.f26532OooOo0O.charAt(i2)));
            default:
                int i3 = this.f26645OooOo0o;
                OooO0o oooO0o = (OooO0o) this.f26643OooOo;
                if (i3 < oooO0o.OooOO0()) {
                    int i4 = this.f26645OooOo0o;
                    this.f26645OooOo0o = i4 + 1;
                    return oooO0o.OooOO0O(i4);
                }
                int i5 = this.f26645OooOo0o;
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i5);
                throw new NoSuchElementException(sb.toString());
        }
    }

    public o0OoOo0(o00O0O o00o0o) {
        this.f26644OooOo0O = 0;
        Objects.requireNonNull(o00o0o);
        this.f26643OooOo = o00o0o;
        this.f26645OooOo0o = 0;
    }
}
