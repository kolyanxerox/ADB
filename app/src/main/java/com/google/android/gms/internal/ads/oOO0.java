package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class oOO0 implements ooooO000 {

    /* renamed from: OooOo */
    public Object f22753OooOo;

    /* renamed from: OooOo0O */
    public long f22754OooOo0O;

    /* renamed from: OooOo0o */
    public long f22755OooOo0o;

    public oOO0() {
        this.f22754OooOo0O = -9223372036854775807L;
        this.f22755OooOo0o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ooooO000
    public void OooO00o(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.f22753OooOo).map(FileChannel.MapMode.READ_ONLY, this.f22754OooOo0O + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public void OooO0O0(Exception exc) throws Exception {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f22753OooOo) == null) {
            this.f22753OooOo = exc;
        }
        if (this.f22754OooOo0O == -9223372036854775807L) {
            synchronized (h71.f19588OoooOoO) {
                z = h71.f19590Ooooo00 > 0;
            }
            if (!z) {
                this.f22754OooOo0O = 200 + jElapsedRealtime;
            }
        }
        long j = this.f22754OooOo0O;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.f22755OooOo0o = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f22753OooOo;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f22753OooOo;
        this.f22753OooOo = null;
        this.f22754OooOo0O = -9223372036854775807L;
        this.f22755OooOo0o = -9223372036854775807L;
        throw exc3;
    }

    @Override // com.google.android.gms.internal.ads.ooooO000
    public long zza() {
        return this.f22755OooOo0o;
    }

    public oOO0(FileChannel fileChannel, long j, long j2) {
        this.f22753OooOo = fileChannel;
        this.f22754OooOo0O = j;
        this.f22755OooOo0o = j2;
    }
}
