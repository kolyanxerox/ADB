package com.applovin.shadow.okio;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        OooOo.OooO0o0(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized int protectedRead(long j, byte[] array, int i, int i2) {
        OooOo.OooO0o0(array, "array");
        this.randomAccessFile.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.randomAccessFile.read(array, i, i2 - i3);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedResize(long j) throws Throwable {
        try {
            try {
                long size = size();
                long j2 = j - size;
                if (j2 > 0) {
                    int i = (int) j2;
                    protectedWrite(size, new byte[i], 0, i);
                } else {
                    this.randomAccessFile.setLength(j);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedWrite(long j, byte[] array, int i, int i2) {
        OooOo.OooO0o0(array, "array");
        this.randomAccessFile.seek(j);
        this.randomAccessFile.write(array, i, i2);
    }
}
