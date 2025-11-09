package org.apache.tika.utils;

import OooO0oO.OooOo;
import OooOo0o.OooO;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ProcessUtils {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new OooO(5)));
    }

    public static String escapeCommandLine(String str) {
        return (str == null || !str.contains(StringUtils.SPACE) || !SystemUtils.IS_OS_WINDOWS || str.startsWith("\"") || str.endsWith("\"")) ? str : OooOo.OooOO0O("\"", str, "\"");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.tika.utils.FileProcessResult execute(java.lang.ProcessBuilder r11, long r12, int r14, int r15) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "\n"
            r1 = 0
            java.lang.Process r11 = r11.start()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = register(r11)     // Catch: java.lang.Throwable -> L6d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6d
            org.apache.tika.utils.StreamGobbler r4 = new org.apache.tika.utils.StreamGobbler     // Catch: java.lang.Throwable -> L6d
            java.io.InputStream r5 = r11.getInputStream()     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r5, r14)     // Catch: java.lang.Throwable -> L6d
            org.apache.tika.utils.StreamGobbler r14 = new org.apache.tika.utils.StreamGobbler     // Catch: java.lang.Throwable -> L6d
            java.io.InputStream r5 = r11.getErrorStream()     // Catch: java.lang.Throwable -> L6d
            r14.<init>(r5, r15)     // Catch: java.lang.Throwable -> L6d
            java.lang.Thread r15 = new java.lang.Thread     // Catch: java.lang.Throwable -> L6d
            r15.<init>(r4)     // Catch: java.lang.Throwable -> L6d
            r15.start()     // Catch: java.lang.Throwable -> L6d
            java.lang.Thread r5 = new java.lang.Thread     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r14)     // Catch: java.lang.Throwable -> L6d
            r5.start()     // Catch: java.lang.Throwable -> L6d
            r6 = 0
            r7 = -1
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            boolean r6 = org.apache.tika.pipes.pipesiterator.p017fs.OooO00o.OooOOO0(r11, r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            long r7 = r12 - r2
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L51
            int r2 = r11.exitValue()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            r15.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            r5.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            goto L66
        L4f:
            r12 = move-exception
            goto L72
        L51:
            org.apache.tika.fork.OooO00o.OooOOo(r11)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            r15.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            r5.join(r12)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            boolean r12 = org.apache.tika.pipes.pipesiterator.p017fs.OooO00o.OooOO0o(r11)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L79
            if (r12 == 0) goto L65
            int r2 = r11.exitValue()     // Catch: java.lang.Throwable -> L4f java.lang.IllegalThreadStateException -> L65 java.lang.InterruptedException -> L79
            goto L66
        L65:
            r2 = -1
        L66:
            r15.interrupt()     // Catch: java.lang.Throwable -> L6d
            r5.interrupt()     // Catch: java.lang.Throwable -> L6d
            goto L81
        L6d:
            r12 = move-exception
            r10 = r1
            r1 = r11
            r11 = r10
            goto Lc5
        L72:
            r15.interrupt()     // Catch: java.lang.Throwable -> L6d
            r5.interrupt()     // Catch: java.lang.Throwable -> L6d
            throw r12     // Catch: java.lang.Throwable -> L6d
        L79:
            r15.interrupt()     // Catch: java.lang.Throwable -> L6d
            r5.interrupt()     // Catch: java.lang.Throwable -> L6d
            r2 = -1000(0xfffffffffffffc18, float:NaN)
        L81:
            org.apache.tika.utils.FileProcessResult r12 = new org.apache.tika.utils.FileProcessResult     // Catch: java.lang.Throwable -> L6d
            r12.<init>()     // Catch: java.lang.Throwable -> L6d
            r12.processTimeMillis = r7     // Catch: java.lang.Throwable -> L6d
            long r7 = r14.getStreamLength()     // Catch: java.lang.Throwable -> L6d
            r12.stderrLength = r7     // Catch: java.lang.Throwable -> L6d
            long r7 = r4.getStreamLength()     // Catch: java.lang.Throwable -> L6d
            r12.stdoutLength = r7     // Catch: java.lang.Throwable -> L6d
            r13 = r6 ^ 1
            r12.isTimeout = r13     // Catch: java.lang.Throwable -> L6d
            r12.exitValue = r2     // Catch: java.lang.Throwable -> L6d
            java.util.List r13 = r4.getLines()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r13 = org.apache.tika.utils.StringUtils.joinWith(r0, r13)     // Catch: java.lang.Throwable -> L6d
            r12.stdout = r13     // Catch: java.lang.Throwable -> L6d
            java.util.List r13 = r14.getLines()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r13 = org.apache.tika.utils.StringUtils.joinWith(r0, r13)     // Catch: java.lang.Throwable -> L6d
            r12.stderr = r13     // Catch: java.lang.Throwable -> L6d
            boolean r13 = r4.getIsTruncated()     // Catch: java.lang.Throwable -> L6d
            r12.stdoutTruncated = r13     // Catch: java.lang.Throwable -> L6d
            boolean r13 = r14.getIsTruncated()     // Catch: java.lang.Throwable -> L6d
            r12.stderrTruncated = r13     // Catch: java.lang.Throwable -> L6d
            org.apache.tika.fork.OooO00o.OooOOo(r11)
            if (r1 == 0) goto Lc2
            release(r1)
        Lc2:
            return r12
        Lc3:
            r12 = move-exception
            r11 = r1
        Lc5:
            if (r1 == 0) goto Lca
            org.apache.tika.fork.OooO00o.OooOOo(r1)
        Lca:
            if (r11 == 0) goto Lcf
            release(r11)
        Lcf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.utils.ProcessUtils.execute(java.lang.ProcessBuilder, long, int, int):org.apache.tika.utils.FileProcessResult");
    }

    public static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new org.apache.tika.mime.OooO00o(2));
    }

    private static String register(Process process) {
        String string = UUID.randomUUID().toString();
        PROCESS_MAP.put(string, process);
        return string;
    }

    private static Process release(String str) {
        return PROCESS_MAP.remove(str);
    }

    public static String unescapeCommandLine(String str) {
        return (str.contains(StringUtils.SPACE) && SystemUtils.IS_OS_WINDOWS && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static FileProcessResult execute(ProcessBuilder processBuilder, long j, Path path, int i) throws Throwable {
        String str;
        Process processStart;
        boolean zWaitFor;
        int iExitValue;
        if (!Files.isDirectory(path.getParent(), new LinkOption[0])) {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
        }
        processBuilder.redirectOutput(path.toFile());
        Process process = null;
        String strRegister = null;
        try {
            processStart = processBuilder.start();
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            strRegister = register(processStart);
            long jCurrentTimeMillis = System.currentTimeMillis();
            StreamGobbler streamGobbler = new StreamGobbler(processStart.getErrorStream(), i);
            Thread thread = new Thread(streamGobbler);
            thread.start();
            long jCurrentTimeMillis2 = -1;
            try {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                zWaitFor = processStart.waitFor(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                zWaitFor = false;
            }
            try {
                jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (!zWaitFor) {
                    processStart.destroyForcibly();
                    thread.join(1000L);
                    iExitValue = -1;
                } else {
                    iExitValue = processStart.exitValue();
                    thread.join(1000L);
                }
            } catch (InterruptedException unused2) {
                iExitValue = -1000;
                FileProcessResult fileProcessResult = new FileProcessResult();
                fileProcessResult.processTimeMillis = jCurrentTimeMillis2;
                fileProcessResult.stderrLength = streamGobbler.getStreamLength();
                fileProcessResult.stdoutLength = Files.size(path);
                fileProcessResult.isTimeout = !zWaitFor;
                fileProcessResult.exitValue = iExitValue;
                fileProcessResult.stdout = "";
                fileProcessResult.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
                fileProcessResult.stdoutTruncated = false;
                fileProcessResult.stderrTruncated = streamGobbler.getIsTruncated();
                processStart.destroyForcibly();
                release(strRegister);
                return fileProcessResult;
            }
            FileProcessResult fileProcessResult2 = new FileProcessResult();
            fileProcessResult2.processTimeMillis = jCurrentTimeMillis2;
            fileProcessResult2.stderrLength = streamGobbler.getStreamLength();
            fileProcessResult2.stdoutLength = Files.size(path);
            fileProcessResult2.isTimeout = !zWaitFor;
            fileProcessResult2.exitValue = iExitValue;
            fileProcessResult2.stdout = "";
            fileProcessResult2.stderr = StringUtils.joinWith("\n", streamGobbler.getLines());
            fileProcessResult2.stdoutTruncated = false;
            fileProcessResult2.stderrTruncated = streamGobbler.getIsTruncated();
            processStart.destroyForcibly();
            release(strRegister);
            return fileProcessResult2;
        } catch (Throwable th2) {
            th = th2;
            String str2 = strRegister;
            process = processStart;
            str = str2;
            if (process != null) {
                process.destroyForcibly();
            }
            release(str);
            throw th;
        }
    }
}
