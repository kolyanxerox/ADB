package com.applovin.shadow.okio.internal;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import o000O00.o00O0O0O;
import o00O0.OooOOO0;
import o00O0.o000OOo;
import o00O0.o00Oo0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOO;
import o00O0Oo.o00O0O;
import o00O0o.Oooo0;
import o00O0o.Oooo000;
import o00O0o.o000oOoO;
import oo00o.OooOo;

/* renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes2.dex */
public final class FileSystem {

    @OooO(m13471c = "com.applovin.shadow.okio.internal.-FileSystem", m13472f = "FileSystem.kt", m13473l = {116, 135, 145}, m13474m = "collectRecursively")
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1 */
    public static final class C13611 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C13611(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    @OooO(m13471c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", m13472f = "FileSystem.kt", m13473l = {96}, m13474m = "invokeSuspend")
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1 */
    public static final class C13621 extends OooOOO implements o00O0O {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13621(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C13621 c13621 = new C13621(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, oooO0OO);
            c13621.L$0 = obj;
            return c13621;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o000oOoO o000oooo2;
            OooOOO0 oooOOO0;
            Iterator<Path> it;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o000oOoO o000oooo3 = (o000oOoO) this.L$0;
                OooOOO0 oooOOO02 = new OooOOO0();
                oooOOO02.addLast(this.$dir);
                o000oooo2 = o000oooo3;
                oooOOO0 = oooOOO02;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                OooOOO0 oooOOO03 = (OooOOO0) this.L$1;
                o000oooo2 = (o000oOoO) this.L$0;
                o000OOo.OooOO0O(obj);
                oooOOO0 = oooOOO03;
            }
            while (it.hasNext()) {
                Path next = it.next();
                com.applovin.shadow.okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z = this.$followSymlinks;
                this.L$0 = o000oooo2;
                this.L$1 = oooOOO0;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(o000oooo2, fileSystem, oooOOO0, next, z, false, this) == oooOo00) {
                    return oooOo00;
                }
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000oOoO o000oooo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C13621) create(o000oooo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, o00O0.OooOOO0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object collectRecursively(o00O0o.o000oOoO r17, com.applovin.shadow.okio.FileSystem r18, o00O0.OooOOO0 r19, com.applovin.shadow.okio.Path r20, boolean r21, boolean r22, o00O0O0O.OooO0OO r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.collectRecursively(o00O0o.o000oOoO, com.applovin.shadow.okio.FileSystem, o00O0.OooOOO0, com.applovin.shadow.okio.Path, boolean, boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void commonCopy(com.applovin.shadow.okio.FileSystem r4, com.applovin.shadow.okio.Path r5, com.applovin.shadow.okio.Path r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.OooOo.OooO0o0(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.OooOo.OooO0o0(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.OooOo.OooO0o0(r6, r0)
            com.applovin.shadow.okio.Source r5 = r4.source(r5)
            r0 = 0
            com.applovin.shadow.okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L3a
            com.applovin.shadow.okio.BufferedSink r4 = com.applovin.shadow.okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L3a
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3e
        L2c:
            r4 = r0
            goto L3e
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L3c
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r4 = move-exception
            com.google.android.gms.internal.measurement.o0OO0O0.OooO00o(r6, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r4 = move-exception
            goto L54
        L3c:
            r4 = r6
            r6 = r0
        L3e:
            if (r4 != 0) goto L53
            kotlin.jvm.internal.OooOo.OooO0O0(r6)     // Catch: java.lang.Throwable -> L3a
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r0 = move-exception
            goto L61
        L53:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L54:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            com.google.android.gms.internal.measurement.o0OO0O0.OooO00o(r4, r5)
        L5e:
            r3 = r0
            r0 = r4
            r4 = r3
        L61:
            if (r0 != 0) goto L67
            kotlin.jvm.internal.OooOo.OooO0O0(r4)
            return
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.commonCopy(com.applovin.shadow.okio.FileSystem, com.applovin.shadow.okio.Path, com.applovin.shadow.okio.Path):void");
    }

    public static final void commonCreateDirectories(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(fileSystem, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(dir, "dir");
        OooOOO0 oooOOO0 = new OooOOO0();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            oooOOO0.addFirst(pathParent);
        }
        if (z && oooOOO0.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = oooOOO0.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path fileOrDirectory, boolean z) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(fileSystem, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(fileOrDirectory, "fileOrDirectory");
        Oooo0 oooo0OooOo00 = o00O0O0O.OooOo00(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null));
        while (oooo0OooOo00.hasNext()) {
            fileSystem.delete((Path) oooo0OooOo00.next(), z && !oooo0OooOo00.hasNext());
        }
    }

    public static final boolean commonExists(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(fileSystem, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final Oooo000 commonListRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path dir, boolean z) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(fileSystem, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(dir, "dir");
        return new o00Oo0(new C13621(dir, fileSystem, z, null));
    }

    public static final FileMetadata commonMetadata(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(fileSystem, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(OooO00o.OooO(path, "no such file: "));
    }

    public static final Path symlinkTarget(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(fileSystem, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        kotlin.jvm.internal.OooOo.OooO0O0(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
