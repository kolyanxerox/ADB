package o00Oo00;

import java.io.InputStream;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes3.dex */
public final class OooOOO0 extends InputStream {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f32667OooOoO = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f32668OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final byte[] f32669OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f32670OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f32671OooOoO0;

    public OooOOO0(byte[] bArr) {
        int length = bArr.length;
        this.f32669OooOo0O = bArr;
        this.f32670OooOo0o = length;
        this.f32668OooOo = 0;
        this.f32671OooOoO0 = 0;
    }

    public static void OooO00o(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str.concat(" cannot be negative"));
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.f32668OooOo;
        int i2 = this.f32670OooOo0o;
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f32671OooOoO0 = this.f32668OooOo;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f32668OooOo;
        if (i >= this.f32670OooOo0o) {
            return -1;
        }
        this.f32668OooOo = i + 1;
        return this.f32669OooOo0O[i] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f32668OooOo = this.f32671OooOoO0;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i = this.f32668OooOo;
        long j2 = this.f32670OooOo0o - i;
        if (j < j2) {
            j2 = j;
        }
        this.f32668OooOo = Math.addExact(i, Math.toIntExact(j));
        return j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "dest");
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int i3 = this.f32668OooOo;
            int i4 = this.f32670OooOo0o;
            if (i3 >= i4) {
                return -1;
            }
            int i5 = i4 - i3;
            if (i2 >= i5) {
                i2 = i5;
            }
            if (i2 <= 0) {
                return 0;
            }
            System.arraycopy(this.f32669OooOo0O, i3, bArr, i, i2);
            this.f32668OooOo += i2;
            return i2;
        }
        throw new IndexOutOfBoundsException();
    }

    public OooOOO0(byte[] bArr, int i) {
        OooO00o(0, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        OooO00o(i, "length");
        Objects.requireNonNull(bArr, "data");
        this.f32669OooOo0O = bArr;
        OooO00o(0, "defaultValue");
        this.f32670OooOo0o = Math.min(Math.min(0, bArr.length > 0 ? bArr.length : 0) + i, bArr.length);
        OooO00o(0, "defaultValue");
        this.f32668OooOo = Math.min(0, bArr.length > 0 ? bArr.length : 0);
        OooO00o(0, "defaultValue");
        this.f32671OooOoO0 = Math.min(0, bArr.length > 0 ? bArr.length : 0);
    }
}
