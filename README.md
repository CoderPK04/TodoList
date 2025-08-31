├── .gitattributes
├── .gitignore
├── .idea
    ├── .gitignore
    ├── compiler.xml
    ├── encodings.xml
    ├── jarRepositories.xml
    └── misc.xml
├── .mvn
    └── wrapper
    │   └── maven-wrapper.properties
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │   │   └── todolist
    │   │   │       └── TodoList
    │   │   │           ├── TodoListAppApplication.java
    │   │   │           ├── controller
    │   │   │               └── HomeController.java
    │   │   │           ├── model
    │   │   │               └── Todo.java
    │   │   │           └── repository
    │   │   │               └── TodoRepository.java
    │   └── resources
    │   │   ├── application.properties
    │   │   ├── static
    │   │       └── style.css
    │   │   └── templates
    │   │       └── index.html
    └── test
    │   └── java
    │       └── com
    │           └── todolist
    │               └── TodoList
    │                   └── TodoListAppApplicationTests.java
└── target
    ├── TodoList-0.0.1-SNAPSHOT.jar
    ├── TodoList-0.0.1-SNAPSHOT.jar.original
    ├── classes
        ├── application.properties
        ├── com
        │   └── todolist
        │   │   └── TodoList
        │   │       ├── TodoListAppApplication.class
        │   │       ├── controller
        │   │           └── HomeController.class
        │   │       ├── model
        │   │           └── Todo.class
        │   │       └── repository
        │   │           └── TodoRepository.class
        ├── static
        │   └── style.css
        └── templates
        │   └── index.html
    ├── maven-archiver
        └── pom.properties
    ├── maven-status
        └── maven-compiler-plugin
        │   ├── compile
        │       └── default-compile
        │       │   ├── createdFiles.lst
        │       │   └── inputFiles.lst
        │   └── testCompile
        │       └── default-testCompile
        │           ├── createdFiles.lst
        │           └── inputFiles.lst
    ├── surefire-reports
        ├── TEST-com.todolist.TodoList.TodoListAppApplicationTests.xml
        └── com.todolist.TodoList.TodoListAppApplicationTests.txt
    └── test-classes
        └── com
            └── todolist
                └── TodoList
                    └── TodoListAppApplicationTests.class


/.gitattributes:
--------------------------------------------------------------------------------
1 | /mvnw text eol=lf
2 | *.cmd text eol=crlf
3 | 


--------------------------------------------------------------------------------
/.gitignore:
--------------------------------------------------------------------------------
1 | # See README for details
2 | 


--------------------------------------------------------------------------------
/.idea/.gitignore:
--------------------------------------------------------------------------------
1 | # Default ignored files
2 | /shelf/
3 | /workspace.xml
4 | 


--------------------------------------------------------------------------------
/.idea/compiler.xml:
--------------------------------------------------------------------------------
 1 | <?xml version="1.0" encoding="UTF-8"?>
 2 | <project version="4">
 3 |   <component name="CompilerConfiguration">
 4 |     <annotationProcessing>
 5 |       <profile name="Maven default annotation processors profile" enabled="true">
 6 |         <sourceOutputDir name="target/generated-sources/annotations" />
 7 |         <sourceTestOutputDir name="target/generated-test-sources/test-annotations" />
 8 |         <outputRelativeToContentRoot value="true" />
 9 |         <module name="TodoList" />
10 |       </profile>
11 |     </annotationProcessing>
12 |   </component>
13 |   <component name="JavacSettings">
14 |     <option name="ADDITIONAL_OPTIONS_OVERRIDE">
15 |       <module name="TodoList" options="-parameters" />
16 |     </option>
17 |   </component>
18 | </project>


--------------------------------------------------------------------------------
/.idea/encodings.xml:
--------------------------------------------------------------------------------
1 | <?xml version="1.0" encoding="UTF-8"?>
2 | <project version="4">
3 |   <component name="Encoding">
4 |     <file url="file://$PROJECT_DIR$/src/main/java" charset="UTF-8" />
5 |   </component>
6 | </project>


--------------------------------------------------------------------------------
/.idea/jarRepositories.xml:
--------------------------------------------------------------------------------
 1 | <?xml version="1.0" encoding="UTF-8"?>
 2 | <project version="4">
 3 |   <component name="RemoteRepositoriesConfiguration">
 4 |     <remote-repository>
 5 |       <option name="id" value="central" />
 6 |       <option name="name" value="Central Repository" />
 7 |       <option name="url" value="https://repo.maven.apache.org/maven2" />
 8 |     </remote-repository>
 9 |     <remote-repository>
10 |       <option name="id" value="central" />
11 |       <option name="name" value="Maven Central repository" />
12 |       <option name="url" value="https://repo1.maven.org/maven2" />
13 |     </remote-repository>
14 |     <remote-repository>
15 |       <option name="id" value="jboss.community" />
16 |       <option name="name" value="JBoss Community repository" />
17 |       <option name="url" value="https://repository.jboss.org/nexus/content/repositories/public/" />
18 |     </remote-repository>
19 |   </component>
20 | </project>


--------------------------------------------------------------------------------
/.idea/misc.xml:
--------------------------------------------------------------------------------
 1 | <?xml version="1.0" encoding="UTF-8"?>
 2 | <project version="4">
 3 |   <component name="ExternalStorageConfigurationManager" enabled="true" />
 4 |   <component name="MavenProjectsManager">
 5 |     <option name="originalFiles">
 6 |       <list>
 7 |         <option value="$PROJECT_DIR$/pom.xml" />
 8 |       </list>
 9 |     </option>
10 |   </component>
11 |   <component name="ProjectRootManager" version="2" languageLevel="JDK_22" default="true" project-jdk-name="22" project-jdk-type="JavaSDK" />
12 | </project>


--------------------------------------------------------------------------------
/.mvn/wrapper/maven-wrapper.properties:
--------------------------------------------------------------------------------
 1 | # Licensed to the Apache Software Foundation (ASF) under one
 2 | # or more contributor license agreements.  See the NOTICE file
 3 | # distributed with this work for additional information
 4 | # regarding copyright ownership.  The ASF licenses this file
 5 | # to you under the Apache License, Version 2.0 (the
 6 | # "License"); you may not use this file except in compliance
 7 | # with the License.  You may obtain a copy of the License at
 8 | #
 9 | #   http://www.apache.org/licenses/LICENSE-2.0
10 | #
11 | # Unless required by applicable law or agreed to in writing,
12 | # software distributed under the License is distributed on an
13 | # "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
14 | # KIND, either express or implied.  See the License for the
15 | # specific language governing permissions and limitations
16 | # under the License.
17 | wrapperVersion=3.3.2
18 | distributionType=only-script
19 | distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.11/apache-maven-3.9.11-bin.zip
20 | 


--------------------------------------------------------------------------------
/HELP.md:
--------------------------------------------------------------------------------
 1 | # Getting Started
 2 | 
 3 | ### Reference Documentation
 4 | For further reference, please consider the following sections:
 5 | 
 6 | * [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
 7 | * [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.5/maven-plugin)
 8 | * [Create an OCI image](https://docs.spring.io/spring-boot/3.5.5/maven-plugin/build-image.html)
 9 | * [Spring Web](https://docs.spring.io/spring-boot/3.5.5/reference/web/servlet.html)
10 | * [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.5/reference/using/devtools.html)
11 | * [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.5/reference/data/sql.html#data.sql.jpa-and-spring-data)
12 | 
13 | ### Guides
14 | The following guides illustrate how to use some features concretely:
15 | 
16 | * [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
17 | * [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
18 | * [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
19 | * [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
20 | 
21 | ### Maven Parent overrides
22 | 
23 | Due to Maven's design, elements are inherited from the parent POM to the project POM.
24 | While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
25 | To prevent this, the project POM contains empty overrides for these elements.
26 | If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
27 | 
28 | 


--------------------------------------------------------------------------------
/mvnw:
--------------------------------------------------------------------------------
  1 | #!/bin/sh
  2 | # ----------------------------------------------------------------------------
  3 | # Licensed to the Apache Software Foundation (ASF) under one
  4 | # or more contributor license agreements.  See the NOTICE file
  5 | # distributed with this work for additional information
  6 | # regarding copyright ownership.  The ASF licenses this file
  7 | # to you under the Apache License, Version 2.0 (the
  8 | # "License"); you may not use this file except in compliance
  9 | # with the License.  You may obtain a copy of the License at
 10 | #
 11 | #    http://www.apache.org/licenses/LICENSE-2.0
 12 | #
 13 | # Unless required by applicable law or agreed to in writing,
 14 | # software distributed under the License is distributed on an
 15 | # "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 16 | # KIND, either express or implied.  See the License for the
 17 | # specific language governing permissions and limitations
 18 | # under the License.
 19 | # ----------------------------------------------------------------------------
 20 | 
 21 | # ----------------------------------------------------------------------------
 22 | # Apache Maven Wrapper startup batch script, version 3.3.2
 23 | #
 24 | # Optional ENV vars
 25 | # -----------------
 26 | #   JAVA_HOME - location of a JDK home dir, required when download maven via java source
 27 | #   MVNW_REPOURL - repo url base for downloading maven distribution
 28 | #   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
 29 | #   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
 30 | # ----------------------------------------------------------------------------
 31 | 
 32 | set -euf
 33 | [ "${MVNW_VERBOSE-}" != debug ] || set -x
 34 | 
 35 | # OS specific support.
 36 | native_path() { printf %s\\n "$1"; }
 37 | case "$(uname)" in
 38 | CYGWIN* | MINGW*)
 39 |   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
 40 |   native_path() { cygpath --path --windows "$1"; }
 41 |   ;;
 42 | esac
 43 | 
 44 | # set JAVACMD and JAVACCMD
 45 | set_java_home() {
 46 |   # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
 47 |   if [ -n "${JAVA_HOME-}" ]; then
 48 |     if [ -x "$JAVA_HOME/jre/sh/java" ]; then
 49 |       # IBM's JDK on AIX uses strange locations for the executables
 50 |       JAVACMD="$JAVA_HOME/jre/sh/java"
 51 |       JAVACCMD="$JAVA_HOME/jre/sh/javac"
 52 |     else
 53 |       JAVACMD="$JAVA_HOME/bin/java"
 54 |       JAVACCMD="$JAVA_HOME/bin/javac"
 55 | 
 56 |       if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
 57 |         echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
 58 |         echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
 59 |         return 1
 60 |       fi
 61 |     fi
 62 |   else
 63 |     JAVACMD="$(
 64 |       'set' +e
 65 |       'unset' -f command 2>/dev/null
 66 |       'command' -v java
 67 |     )" || :
 68 |     JAVACCMD="$(
 69 |       'set' +e
 70 |       'unset' -f command 2>/dev/null
 71 |       'command' -v javac
 72 |     )" || :
 73 | 
 74 |     if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
 75 |       echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
 76 |       return 1
 77 |     fi
 78 |   fi
 79 | }
 80 | 
 81 | # hash string like Java String::hashCode
 82 | hash_string() {
 83 |   str="${1:-}" h=0
 84 |   while [ -n "$str" ]; do
 85 |     char="${str%"${str#?}"}"
 86 |     h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
 87 |     str="${str#?}"
 88 |   done
 89 |   printf %x\\n $h
 90 | }
 91 | 
 92 | verbose() { :; }
 93 | [ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }
 94 | 
 95 | die() {
 96 |   printf %s\\n "$1" >&2
 97 |   exit 1
 98 | }
 99 | 
100 | trim() {
101 |   # MWRAPPER-139:
102 |   #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
103 |   #   Needed for removing poorly interpreted newline sequences when running in more
104 |   #   exotic environments such as mingw bash on Windows.
105 |   printf "%s" "${1}" | tr -d '[:space:]'
106 | }
107 | 
108 | # parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
109 | while IFS="=" read -r key value; do
110 |   case "${key-}" in
111 |   distributionUrl) distributionUrl=$(trim "${value-}") ;;
112 |   distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
113 |   esac
114 | done <"${0%/*}/.mvn/wrapper/maven-wrapper.properties"
115 | [ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in ${0%/*}/.mvn/wrapper/maven-wrapper.properties"
116 | 
117 | case "${distributionUrl##*/}" in
118 | maven-mvnd-*bin.*)
119 |   MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
120 |   case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
121 |   *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
122 |   :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
123 |   :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
124 |   :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
125 |   *)
126 |     echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
127 |     distributionPlatform=linux-amd64
128 |     ;;
129 |   esac
130 |   distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
131 |   ;;
132 | maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
133 | *) MVN_CMD="mvn${0##*/mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
134 | esac
135 | 
136 | # apply MVNW_REPOURL and calculate MAVEN_HOME
137 | # maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
138 | [ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
139 | distributionUrlName="${distributionUrl##*/}"
140 | distributionUrlNameMain="${distributionUrlName%.*}"
141 | distributionUrlNameMain="${distributionUrlNameMain%-bin}"
142 | MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
143 | MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"
144 | 
145 | exec_maven() {
146 |   unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
147 |   exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
148 | }
149 | 
150 | if [ -d "$MAVEN_HOME" ]; then
151 |   verbose "found existing MAVEN_HOME at $MAVEN_HOME"
152 |   exec_maven "$@"
153 | fi
154 | 
155 | case "${distributionUrl-}" in
156 | *?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
157 | *) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
158 | esac
159 | 
160 | # prepare tmp dir
161 | if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
162 |   clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
163 |   trap clean HUP INT TERM EXIT
164 | else
165 |   die "cannot create temp dir"
166 | fi
167 | 
168 | mkdir -p -- "${MAVEN_HOME%/*}"
169 | 
170 | # Download and Install Apache Maven
171 | verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
172 | verbose "Downloading from: $distributionUrl"
173 | verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"
174 | 
175 | # select .zip or .tar.gz
176 | if ! command -v unzip >/dev/null; then
177 |   distributionUrl="${distributionUrl%.zip}.tar.gz"
178 |   distributionUrlName="${distributionUrl##*/}"
179 | fi
180 | 
181 | # verbose opt
182 | __MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
183 | [ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v
184 | 
185 | # normalize http auth
186 | case "${MVNW_PASSWORD:+has-password}" in
187 | '') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
188 | has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
189 | esac
190 | 
191 | if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
192 |   verbose "Found wget ... using wget"
193 |   wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
194 | elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
195 |   verbose "Found curl ... using curl"
196 |   curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
197 | elif set_java_home; then
198 |   verbose "Falling back to use Java to download"
199 |   javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
200 |   targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
201 |   cat >"$javaSource" <<-END
202 | 	public class Downloader extends java.net.Authenticator
203 | 	{
204 | 	  protected java.net.PasswordAuthentication getPasswordAuthentication()
205 | 	  {
206 | 	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
207 | 	  }
208 | 	  public static void main( String[] args ) throws Exception
209 | 	  {
210 | 	    setDefault( new Downloader() );
211 | 	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
212 | 	  }
213 | 	}
214 | 	END
215 |   # For Cygwin/MinGW, switch paths to Windows format before running javac and java
216 |   verbose " - Compiling Downloader.java ..."
217 |   "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
218 |   verbose " - Running Downloader.java ..."
219 |   "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
220 | fi
221 | 
222 | # If specified, validate the SHA-256 sum of the Maven distribution zip file
223 | if [ -n "${distributionSha256Sum-}" ]; then
224 |   distributionSha256Result=false
225 |   if [ "$MVN_CMD" = mvnd.sh ]; then
226 |     echo "Checksum validation is not supported for maven-mvnd." >&2
227 |     echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
228 |     exit 1
229 |   elif command -v sha256sum >/dev/null; then
230 |     if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c >/dev/null 2>&1; then
231 |       distributionSha256Result=true
232 |     fi
233 |   elif command -v shasum >/dev/null; then
234 |     if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
235 |       distributionSha256Result=true
236 |     fi
237 |   else
238 |     echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
239 |     echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
240 |     exit 1
241 |   fi
242 |   if [ $distributionSha256Result = false ]; then
243 |     echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
244 |     echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
245 |     exit 1
246 |   fi
247 | fi
248 | 
249 | # unzip and move
250 | if command -v unzip >/dev/null; then
251 |   unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
252 | else
253 |   tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
254 | fi
255 | printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/mvnw.url"
256 | mv -- "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"
257 | 
258 | clean || :
259 | exec_maven "$@"
260 | 


--------------------------------------------------------------------------------
/mvnw.cmd:
--------------------------------------------------------------------------------
  1 | <# : batch portion
  2 | @REM ----------------------------------------------------------------------------
  3 | @REM Licensed to the Apache Software Foundation (ASF) under one
  4 | @REM or more contributor license agreements.  See the NOTICE file
  5 | @REM distributed with this work for additional information
  6 | @REM regarding copyright ownership.  The ASF licenses this file
  7 | @REM to you under the Apache License, Version 2.0 (the
  8 | @REM "License"); you may not use this file except in compliance
  9 | @REM with the License.  You may obtain a copy of the License at
 10 | @REM
 11 | @REM    http://www.apache.org/licenses/LICENSE-2.0
 12 | @REM
 13 | @REM Unless required by applicable law or agreed to in writing,
 14 | @REM software distributed under the License is distributed on an
 15 | @REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 16 | @REM KIND, either express or implied.  See the License for the
 17 | @REM specific language governing permissions and limitations
 18 | @REM under the License.
 19 | @REM ----------------------------------------------------------------------------
 20 | 
 21 | @REM ----------------------------------------------------------------------------
 22 | @REM Apache Maven Wrapper startup batch script, version 3.3.2
 23 | @REM
 24 | @REM Optional ENV vars
 25 | @REM   MVNW_REPOURL - repo url base for downloading maven distribution
 26 | @REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
 27 | @REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
 28 | @REM ----------------------------------------------------------------------------
 29 | 
 30 | @IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
 31 | @SET __MVNW_CMD__=
 32 | @SET __MVNW_ERROR__=
 33 | @SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
 34 | @SET PSModulePath=
 35 | @FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
 36 |   IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
 37 | )
 38 | @SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
 39 | @SET __MVNW_PSMODULEP_SAVE=
 40 | @SET __MVNW_ARG0_NAME__=
 41 | @SET MVNW_USERNAME=
 42 | @SET MVNW_PASSWORD=
 43 | @IF NOT "%__MVNW_CMD__%"=="" (%__MVNW_CMD__% %*)
 44 | @echo Cannot start maven from wrapper >&2 && exit /b 1
 45 | @GOTO :EOF
 46 | : end batch / begin powershell #>
 47 | 
 48 | $ErrorActionPreference = "Stop"
 49 | if ($env:MVNW_VERBOSE -eq "true") {
 50 |   $VerbosePreference = "Continue"
 51 | }
 52 | 
 53 | # calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
 54 | $distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
 55 | if (!$distributionUrl) {
 56 |   Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
 57 | }
 58 | 
 59 | switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
 60 |   "maven-mvnd-*" {
 61 |     $USE_MVND = $true
 62 |     $distributionUrl = $distributionUrl -replace '-bin\.[^.]*
#39;,"-windows-amd64.zip"
 63 |     $MVN_CMD = "mvnd.cmd"
 64 |     break
 65 |   }
 66 |   default {
 67 |     $USE_MVND = $false
 68 |     $MVN_CMD = $script -replace '^mvnw','mvn'
 69 |     break
 70 |   }
 71 | }
 72 | 
 73 | # apply MVNW_REPOURL and calculate MAVEN_HOME
 74 | # maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
 75 | if ($env:MVNW_REPOURL) {
 76 |   $MVNW_REPO_PATTERN = if ($USE_MVND) { "/org/apache/maven/" } else { "/maven/mvnd/" }
 77 |   $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace '^.*'+$MVNW_REPO_PATTERN,'')"
 78 | }
 79 | $distributionUrlName = $distributionUrl -replace '^.*/',''
 80 | $distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*
#39;,'' -replace '-bin
#39;,''
 81 | $MAVEN_HOME_PARENT = "$HOME/.m2/wrapper/dists/$distributionUrlNameMain"
 82 | if ($env:MAVEN_USER_HOME) {
 83 |   $MAVEN_HOME_PARENT = "$env:MAVEN_USER_HOME/wrapper/dists/$distributionUrlNameMain"
 84 | }
 85 | $MAVEN_HOME_NAME = ([System.Security.Cryptography.MD5]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
 86 | $MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"
 87 | 
 88 | if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
 89 |   Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
 90 |   Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
 91 |   exit $?
 92 | }
 93 | 
 94 | if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
 95 |   Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
 96 | }
 97 | 
 98 | # prepare tmp dir
 99 | $TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
100 | $TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
101 | $TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
102 | trap {
103 |   if ($TMP_DOWNLOAD_DIR.Exists) {
104 |     try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
105 |     catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
106 |   }
107 | }
108 | 
109 | New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null
110 | 
111 | # Download and Install Apache Maven
112 | Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
113 | Write-Verbose "Downloading from: $distributionUrl"
114 | Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"
115 | 
116 | $webclient = New-Object System.Net.WebClient
117 | if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
118 |   $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
119 | }
120 | [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
121 | $webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null
122 | 
123 | # If specified, validate the SHA-256 sum of the Maven distribution zip file
124 | $distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
125 | if ($distributionSha256Sum) {
126 |   if ($USE_MVND) {
127 |     Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
128 |   }
129 |   Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
130 |   if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
131 |     Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
132 |   }
133 | }
134 | 
135 | # unzip and move
136 | Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null
137 | Rename-Item -Path "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" -NewName $MAVEN_HOME_NAME | Out-Null
138 | try {
139 |   Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
140 | } catch {
141 |   if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
142 |     Write-Error "fail to move MAVEN_HOME"
143 |   }
144 | } finally {
145 |   try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
146 |   catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
147 | }
148 | 
149 | Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
150 | 


--------------------------------------------------------------------------------
/pom.xml:
--------------------------------------------------------------------------------
 1 | <?xml version="1.0" encoding="UTF-8"?>
 2 | <project xmlns="http://maven.apache.org/POM/4.0.0"
 3 | 		 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 4 | 		 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
 5 | 
 6 | 	<modelVersion>4.0.0</modelVersion>
 7 | 
 8 | 	<parent>
 9 | 		<groupId>org.springframework.boot</groupId>
10 | 		<artifactId>spring-boot-starter-parent</artifactId>
11 | 		<version>3.3.3</version> <!-- ✅ 3.5.5 does not exist, latest stable is 3.3.3 -->
12 | 		<relativePath/> <!-- lookup parent from repository -->
13 | 	</parent>
14 | 
15 | 	<groupId>com.todolist</groupId>
16 | 	<artifactId>TodoList</artifactId>
17 | 	<version>0.0.1-SNAPSHOT</version>
18 | 	<name>TodoList App</name>
19 | 	<description>Demo project for Spring Boot</description>
20 | 
21 | 	<properties>
22 | 		<java.version>21</java.version>
23 | 	</properties>
24 | 
25 | 	<dependencies>
26 | 		<!-- Web + REST support -->
27 | 		<dependency>
28 | 			<groupId>org.springframework.boot</groupId>
29 | 			<artifactId>spring-boot-starter-web</artifactId>
30 | 		</dependency>
31 | 
32 | 		<!-- Thymeleaf template engine -->
33 | 		<dependency>
34 | 			<groupId>org.springframework.boot</groupId>
35 | 			<artifactId>spring-boot-starter-thymeleaf</artifactId>
36 | 		</dependency>
37 | 
38 | 		<!-- JPA for database access -->
39 | 		<dependency>
40 | 			<groupId>org.springframework.boot</groupId>
41 | 			<artifactId>spring-boot-starter-data-jpa</artifactId>
42 | 		</dependency>
43 | 
44 | 		<!-- In-memory H2 database -->
45 | 		<dependency>
46 | 			<groupId>com.h2database</groupId>
47 | 			<artifactId>h2</artifactId>
48 | 			<scope>runtime</scope>
49 | 		</dependency>
50 | 
51 | 		<!-- Developer tools (auto-restart) -->
52 | 		<dependency>
53 | 			<groupId>org.springframework.boot</groupId>
54 | 			<artifactId>spring-boot-devtools</artifactId>
55 | 			<scope>runtime</scope>
56 | 			<optional>true</optional>
57 | 		</dependency>
58 | 
59 | 		<!-- Testing -->
60 | 		<dependency>
61 | 			<groupId>org.springframework.boot</groupId>
62 | 			<artifactId>spring-boot-starter-test</artifactId>
63 | 			<scope>test</scope>
64 | 		</dependency>
65 | 	</dependencies>
66 | 
67 | 	<build>
68 | 		<plugins>
69 | 			<plugin>
70 | 				<groupId>org.springframework.boot</groupId>
71 | 				<artifactId>spring-boot-maven-plugin</artifactId>
72 | 			</plugin>
73 | 		</plugins>
74 | 	</build>
75 | </project>
76 | 


--------------------------------------------------------------------------------
/src/main/java/com/todolist/TodoList/TodoListAppApplication.java:
--------------------------------------------------------------------------------
 1 | package com.todolist.TodoList;
 2 | 
 3 | import org.springframework.boot.SpringApplication;
 4 | import org.springframework.boot.autoconfigure.SpringBootApplication;
 5 | 
 6 | @SpringBootApplication
 7 | public class TodoListAppApplication {
 8 | 
 9 | 	public static void main(String[] args) {
10 | 		SpringApplication.run(TodoListAppApplication.class, args);
11 | 	}
12 | }
13 | 


--------------------------------------------------------------------------------
/src/main/java/com/todolist/TodoList/controller/HomeController.java:
--------------------------------------------------------------------------------
 1 | package com.todolist.TodoList.controller;
 2 | 
 3 | import com.todolist.TodoList.model.Todo;
 4 | import com.todolist.TodoList.repository.TodoRepository;
 5 | import org.springframework.stereotype.Controller;
 6 | import org.springframework.ui.Model;
 7 | import org.springframework.web.bind.annotation.*;
 8 | 
 9 | @Controller
10 | public class HomeController {
11 | 
12 |     private final TodoRepository todoRepository;
13 | 
14 |     public HomeController(TodoRepository todoRepository) {
15 |         this.todoRepository = todoRepository;
16 |     }
17 | 
18 |     @GetMapping("/")
19 |     public String index(Model model) {
20 |         model.addAttribute("todos", todoRepository.findAll());
21 |         return "index";  // will load src/main/resources/templates/index.html
22 |     }
23 | 
24 |     @PostMapping("/add")
25 |     public String addTodo(@ModelAttribute Todo todo) {
26 |         todoRepository.save(todo);
27 |         return "redirect:/";
28 |     }
29 | 
30 |     @GetMapping("/delete/{id}")
31 |     public String deleteTodo(@PathVariable Long id) {
32 |         todoRepository.deleteById(id);
33 |         return "redirect:/";
34 |     }
35 | 
36 |     @GetMapping("/toggle/{id}")
37 |     public String toggleTodo(@PathVariable Long id) {
38 |         Todo todo = todoRepository.findById(id).orElseThrow();
39 |         todo.setCompleted(!todo.isCompleted());
40 |         todoRepository.save(todo);
41 |         return "redirect:/";
42 |     }
43 | }
44 | 


--------------------------------------------------------------------------------
/src/main/java/com/todolist/TodoList/model/Todo.java:
--------------------------------------------------------------------------------
 1 | package com.todolist.TodoList.model;
 2 | 
 3 | import jakarta.persistence.Entity;
 4 | import jakarta.persistence.GeneratedValue;
 5 | import jakarta.persistence.GenerationType;
 6 | import jakarta.persistence.Id;
 7 | 
 8 | @Entity
 9 | public class Todo {
10 | 
11 |     @Id
12 |     @GeneratedValue(strategy = GenerationType.IDENTITY)
13 |     private Long id;
14 | 
15 |     private String title;
16 |     private boolean completed = false;
17 | 
18 |     public Todo() {}
19 | 
20 |     public Todo(String title) {
21 |         this.title = title;
22 |     }
23 | 
24 |     // getters and setters
25 |     public Long getId() { return id; }
26 |     public String getTitle() { return title; }
27 |     public void setTitle(String title) { this.title = title; }
28 |     public boolean isCompleted() { return completed; }
29 |     public void setCompleted(boolean completed) { this.completed = completed; }
30 | }
31 | 


--------------------------------------------------------------------------------
/src/main/java/com/todolist/TodoList/repository/TodoRepository.java:
--------------------------------------------------------------------------------
1 | package com.todolist.TodoList.repository;
2 | 
3 | import com.todolist.TodoList.model.Todo;
4 | import org.springframework.data.jpa.repository.JpaRepository;
5 | 
6 | public interface TodoRepository extends JpaRepository<Todo, Long> {
7 | }
8 | 


--------------------------------------------------------------------------------
/src/main/resources/application.properties:
--------------------------------------------------------------------------------
1 | spring.application.name=TodoList App
2 | server.port=8080
3 | spring.datasource.url=jdbc:h2:mem:testdb
4 | spring.datasource.driverClassName=org.h2.Driver
5 | spring.datasource.username=sa
6 | spring.datasource.password=
7 | spring.jpa.hibernate.ddl-auto=update
8 | spring.h2.console.enabled=true
9 | 


--------------------------------------------------------------------------------
/src/main/resources/static/style.css:
--------------------------------------------------------------------------------
 1 | body {
 2 |     font-family: Arial, sans-serif;
 3 |     background: #f9f9f9;
 4 |     text-align: center;
 5 |     padding: 2rem;
 6 | }
 7 | 
 8 | h1 {
 9 |     color: #2c3e50;
10 | }
11 | 
12 | li {
13 |     list-style: none;
14 |     background: #ecf0f1;
15 |     padding: 10px;
16 |     margin: 5px;
17 |     border-radius: 5px;
18 | }
19 | 


--------------------------------------------------------------------------------
/src/main/resources/templates/index.html:
--------------------------------------------------------------------------------
 1 | <!DOCTYPE html>
 2 | <html xmlns:th="http://www.thymeleaf.org">
 3 | <head>
 4 |     <title>Todo List</title>
 5 |     <style>
 6 |         body { font-family: Arial, sans-serif; margin: 2rem; }
 7 |         .done { text-decoration: line-through; color: gray; }
 8 |     </style>
 9 | </head>
10 | <body>
11 | <h1>My Todo List</h1>
12 | 
13 | <form th:action="@{/add}" method="post">
14 |     <input type="text" name="title" placeholder="New todo..." required>
15 |     <button type="submit">Add</button>
16 | </form>
17 | 
18 | <ul>
19 |     <li th:each="todo : ${todos}">
20 |         <span th:text="${todo.title}" th:classappend="${todo.completed} ? 'done' : ''"></span>
21 |         <a th:href="@{/toggle/{id}(id=${todo.id})}">[Toggle]</a>
22 |         <a th:href="@{/delete/{id}(id=${todo.id})}">[Delete]</a>
23 |     </li>
24 | </ul>
25 | </body>
26 | </html>
27 | 


--------------------------------------------------------------------------------
/src/test/java/com/todolist/TodoList/TodoListAppApplicationTests.java:
--------------------------------------------------------------------------------
 1 | package com.todolist.TodoList;
 2 | 
 3 | import org.junit.jupiter.api.Test;
 4 | import org.springframework.boot.test.context.SpringBootTest;
 5 | 
 6 | @SpringBootTest
 7 | class TodoListAppApplicationTests {
 8 | 
 9 | 	@Test
10 | 	void contextLoads() {
11 | 	}
12 | 
13 | }
14 | 


--------------------------------------------------------------------------------
/target/TodoList-0.0.1-SNAPSHOT.jar:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/CoderPK04/TodoList/main/target/TodoList-0.0.1-SNAPSHOT.jar


--------------------------------------------------------------------------------
/target/TodoList-0.0.1-SNAPSHOT.jar.original:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/CoderPK04/TodoList/main/target/TodoList-0.0.1-SNAPSHOT.jar.original


--------------------------------------------------------------------------------
/target/classes/application.properties:
--------------------------------------------------------------------------------
1 | spring.application.name=TodoList App
2 | server.port=8080
3 | spring.datasource.url=jdbc:h2:mem:testdb
4 | spring.datasource.driverClassName=org.h2.Driver
5 | spring.datasource.username=sa
6 | spring.datasource.password=
7 | spring.jpa.hibernate.ddl-auto=update
8 | spring.h2.console.enabled=true
9 | 


--------------------------------------------------------------------------------
/target/classes/com/todolist/TodoList/TodoListAppApplication.class:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/CoderPK04/TodoList/main/target/classes/com/todolist/TodoList/TodoListAppApplication.class


--------------------------------------------------------------------------------
/target/classes/com/todolist/TodoList/controller/HomeController.class:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/CoderPK04/TodoList/main/target/classes/com/todolist/TodoList/controller/HomeController.class


--------------------------------------------------------------------------------
/target/classes/com/todolist/TodoList/model/Todo.class:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/CoderPK04/TodoList/main/target/classes/com/todolist/TodoList/model/Todo.class


--------------------------------------------------------------------------------
/target/classes/com/todolist/TodoList/repository/TodoRepository.class:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/CoderPK04/TodoList/main/target/classes/com/todolist/TodoList/repository/TodoRepository.class


--------------------------------------------------------------------------------
/target/classes/static/style.css:
--------------------------------------------------------------------------------
 1 | body {
 2 |     font-family: Arial, sans-serif;
 3 |     background: #f9f9f9;
 4 |     text-align: center;
 5 |     padding: 2rem;
 6 | }
 7 | 
 8 | h1 {
 9 |     color: #2c3e50;
10 | }
11 | 
12 | li {
13 |     list-style: none;
14 |     background: #ecf0f1;
15 |     padding: 10px;
16 |     margin: 5px;
17 |     border-radius: 5px;
18 | }
19 | 


--------------------------------------------------------------------------------
/target/classes/templates/index.html:
--------------------------------------------------------------------------------
 1 | <!DOCTYPE html>
 2 | <html xmlns:th="http://www.thymeleaf.org">
 3 | <head>
 4 |     <title>Todo List</title>
 5 |     <style>
 6 |         body { font-family: Arial, sans-serif; margin: 2rem; }
 7 |         .done { text-decoration: line-through; color: gray; }
 8 |     </style>
 9 | </head>
10 | <body>
11 | <h1>My Todo List</h1>
12 | 
13 | <form th:action="@{/add}" method="post">
14 |     <input type="text" name="title" placeholder="New todo..." required>
15 |     <button type="submit">Add</button>
16 | </form>
17 | 
18 | <ul>
19 |     <li th:each="todo : ${todos}">
20 |         <span th:text="${todo.title}" th:classappend="${todo.completed} ? 'done' : ''"></span>
21 |         <a th:href="@{/toggle/{id}(id=${todo.id})}">[Toggle]</a>
22 |         <a th:href="@{/delete/{id}(id=${todo.id})}">[Delete]</a>
23 |     </li>
24 | </ul>
25 | </body>
26 | </html>
27 | 


--------------------------------------------------------------------------------
/target/maven-archiver/pom.properties:
--------------------------------------------------------------------------------
1 | artifactId=TodoList
2 | groupId=com.todolist
3 | version=0.0.1-SNAPSHOT
4 | 


--------------------------------------------------------------------------------
/target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst:
--------------------------------------------------------------------------------
1 | com\todolist\TodoList\TodoListAppApplication.class
2 | com\todolist\TodoList\HomeController.class
3 | 


--------------------------------------------------------------------------------
/target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst:
--------------------------------------------------------------------------------
1 | C:\Users\CIS\TodoList\src\main\java\com\todolist\TodoList\HomeController.java
2 | C:\Users\CIS\TodoList\src\main\java\com\todolist\TodoList\TodoListAppApplication.java
3 | 


--------------------------------------------------------------------------------
/target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/createdFiles.lst:
--------------------------------------------------------------------------------
1 | com\todolist\TodoList\TodoListAppApplicationTests.class
2 | 


--------------------------------------------------------------------------------
/target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/inputFiles.lst:
--------------------------------------------------------------------------------
1 | C:\Users\CIS\TodoList\src\test\java\com\todolist\TodoList\TodoListAppApplicationTests.java
2 | 


--------------------------------------------------------------------------------
/target/surefire-reports/TEST-com.todolist.TodoList.TodoListAppApplicationTests.xml:
--------------------------------------------------------------------------------
  1 | <?xml version="1.0" encoding="UTF-8"?>
  2 | <testsuite xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="https://maven.apache.org/surefire/maven-surefire-plugin/xsd/surefire-test-report-3.0.xsd" version="3.0" name="com.todolist.TodoList.TodoListAppApplicationTests" time="4.756" tests="1" errors="0" skipped="0" failures="0">
  3 |   <properties>
  4 |     <property name="java.specification.version" value="21"/>
  5 |     <property name="sun.cpu.isalist" value="amd64"/>
  6 |     <property name="sun.jnu.encoding" value="Cp1252"/>
  7 |     <property name="java.class.path" value="C:\Users\CIS\TodoList\target\test-classes;C:\Users\CIS\TodoList\target\classes;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.3.3\spring-boot-starter-web-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter\3.3.3\spring-boot-starter-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.3.3\spring-boot-starter-logging-3.3.3.jar;C:\Users\CIS\.m2\repository\ch\qos\logback\logback-classic\1.5.7\logback-classic-1.5.7.jar;C:\Users\CIS\.m2\repository\ch\qos\logback\logback-core\1.5.7\logback-core-1.5.7.jar;C:\Users\CIS\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.23.1\log4j-to-slf4j-2.23.1.jar;C:\Users\CIS\.m2\repository\org\apache\logging\log4j\log4j-api\2.23.1\log4j-api-2.23.1.jar;C:\Users\CIS\.m2\repository\org\slf4j\jul-to-slf4j\2.0.16\jul-to-slf4j-2.0.16.jar;C:\Users\CIS\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\CIS\.m2\repository\org\yaml\snakeyaml\2.2\snakeyaml-2.2.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.3.3\spring-boot-starter-json-3.3.3.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.2\jackson-databind-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.2\jackson-annotations-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.2\jackson-core-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.2\jackson-datatype-jdk8-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.2\jackson-datatype-jsr310-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.17.2\jackson-module-parameter-names-2.17.2.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.3.3\spring-boot-starter-tomcat-3.3.3.jar;C:\Users\CIS\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.28\tomcat-embed-core-10.1.28.jar;C:\Users\CIS\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.28\tomcat-embed-el-10.1.28.jar;C:\Users\CIS\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.28\tomcat-embed-websocket-10.1.28.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-web\6.1.12\spring-web-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-beans\6.1.12\spring-beans-6.1.12.jar;C:\Users\CIS\.m2\repository\io\micrometer\micrometer-observation\1.13.3\micrometer-observation-1.13.3.jar;C:\Users\CIS\.m2\repository\io\micrometer\micrometer-commons\1.13.3\micrometer-commons-1.13.3.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-webmvc\6.1.12\spring-webmvc-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-aop\6.1.12\spring-aop-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-context\6.1.12\spring-context-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-expression\6.1.12\spring-expression-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-thymeleaf\3.3.3\spring-boot-starter-thymeleaf-3.3.3.jar;C:\Users\CIS\.m2\repository\org\thymeleaf\thymeleaf-spring6\3.1.2.RELEASE\thymeleaf-spring6-3.1.2.RELEASE.jar;C:\Users\CIS\.m2\repository\org\thymeleaf\thymeleaf\3.1.2.RELEASE\thymeleaf-3.1.2.RELEASE.jar;C:\Users\CIS\.m2\repository\org\attoparser\attoparser\2.0.7.RELEASE\attoparser-2.0.7.RELEASE.jar;C:\Users\CIS\.m2\repository\org\unbescape\unbescape\1.1.6.RELEASE\unbescape-1.1.6.RELEASE.jar;C:\Users\CIS\.m2\repository\org\slf4j\slf4j-api\2.0.16\slf4j-api-2.0.16.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\3.3.3\spring-boot-starter-data-jpa-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-aop\3.3.3\spring-boot-starter-aop-3.3.3.jar;C:\Users\CIS\.m2\repository\org\aspectj\aspectjweaver\1.9.22.1\aspectjweaver-1.9.22.1.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\3.3.3\spring-boot-starter-jdbc-3.3.3.jar;C:\Users\CIS\.m2\repository\com\zaxxer\HikariCP\5.1.0\HikariCP-5.1.0.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-jdbc\6.1.12\spring-jdbc-6.1.12.jar;C:\Users\CIS\.m2\repository\org\hibernate\orm\hibernate-core\6.5.2.Final\hibernate-core-6.5.2.Final.jar;C:\Users\CIS\.m2\repository\jakarta\persistence\jakarta.persistence-api\3.1.0\jakarta.persistence-api-3.1.0.jar;C:\Users\CIS\.m2\repository\jakarta\transaction\jakarta.transaction-api\2.0.1\jakarta.transaction-api-2.0.1.jar;C:\Users\CIS\.m2\repository\org\jboss\logging\jboss-logging\3.5.3.Final\jboss-logging-3.5.3.Final.jar;C:\Users\CIS\.m2\repository\org\hibernate\common\hibernate-commons-annotations\6.0.6.Final\hibernate-commons-annotations-6.0.6.Final.jar;C:\Users\CIS\.m2\repository\io\smallrye\jandex\3.1.2\jandex-3.1.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\classmate\1.7.0\classmate-1.7.0.jar;C:\Users\CIS\.m2\repository\net\bytebuddy\byte-buddy\1.14.19\byte-buddy-1.14.19.jar;C:\Users\CIS\.m2\repository\org\glassfish\jaxb\jaxb-runtime\4.0.5\jaxb-runtime-4.0.5.jar;C:\Users\CIS\.m2\repository\org\glassfish\jaxb\jaxb-core\4.0.5\jaxb-core-4.0.5.jar;C:\Users\CIS\.m2\repository\org\eclipse\angus\angus-activation\2.0.2\angus-activation-2.0.2.jar;C:\Users\CIS\.m2\repository\org\glassfish\jaxb\txw2\4.0.5\txw2-4.0.5.jar;C:\Users\CIS\.m2\repository\com\sun\istack\istack-commons-runtime\4.1.2\istack-commons-runtime-4.1.2.jar;C:\Users\CIS\.m2\repository\jakarta\inject\jakarta.inject-api\2.0.1\jakarta.inject-api-2.0.1.jar;C:\Users\CIS\.m2\repository\org\antlr\antlr4-runtime\4.13.0\antlr4-runtime-4.13.0.jar;C:\Users\CIS\.m2\repository\org\springframework\data\spring-data-jpa\3.3.3\spring-data-jpa-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\data\spring-data-commons\3.3.3\spring-data-commons-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-orm\6.1.12\spring-orm-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-tx\6.1.12\spring-tx-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-aspects\6.1.12\spring-aspects-6.1.12.jar;C:\Users\CIS\.m2\repository\com\h2database\h2\2.2.224\h2-2.2.224.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-devtools\3.3.3\spring-boot-devtools-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot\3.3.3\spring-boot-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.3.3\spring-boot-autoconfigure-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-test\3.3.3\spring-boot-starter-test-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-test\3.3.3\spring-boot-test-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-test-autoconfigure\3.3.3\spring-boot-test-autoconfigure-3.3.3.jar;C:\Users\CIS\.m2\repository\com\jayway\jsonpath\json-path\2.9.0\json-path-2.9.0.jar;C:\Users\CIS\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\4.0.2\jakarta.xml.bind-api-4.0.2.jar;C:\Users\CIS\.m2\repository\jakarta\activation\jakarta.activation-api\2.1.3\jakarta.activation-api-2.1.3.jar;C:\Users\CIS\.m2\repository\net\minidev\json-smart\2.5.1\json-smart-2.5.1.jar;C:\Users\CIS\.m2\repository\net\minidev\accessors-smart\2.5.1\accessors-smart-2.5.1.jar;C:\Users\CIS\.m2\repository\org\ow2\asm\asm\9.6\asm-9.6.jar;C:\Users\CIS\.m2\repository\org\assertj\assertj-core\3.25.3\assertj-core-3.25.3.jar;C:\Users\CIS\.m2\repository\org\awaitility\awaitility\4.2.2\awaitility-4.2.2.jar;C:\Users\CIS\.m2\repository\org\hamcrest\hamcrest\2.2\hamcrest-2.2.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.3\junit-jupiter-5.10.3.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.3\junit-jupiter-api-5.10.3.jar;C:\Users\CIS\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\CIS\.m2\repository\org\junit\platform\junit-platform-commons\1.10.3\junit-platform-commons-1.10.3.jar;C:\Users\CIS\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.3\junit-jupiter-params-5.10.3.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.3\junit-jupiter-engine-5.10.3.jar;C:\Users\CIS\.m2\repository\org\junit\platform\junit-platform-engine\1.10.3\junit-platform-engine-1.10.3.jar;C:\Users\CIS\.m2\repository\org\mockito\mockito-core\5.11.0\mockito-core-5.11.0.jar;C:\Users\CIS\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.19\byte-buddy-agent-1.14.19.jar;C:\Users\CIS\.m2\repository\org\objenesis\objenesis\3.3\objenesis-3.3.jar;C:\Users\CIS\.m2\repository\org\mockito\mockito-junit-jupiter\5.11.0\mockito-junit-jupiter-5.11.0.jar;C:\Users\CIS\.m2\repository\org\skyscreamer\jsonassert\1.5.3\jsonassert-1.5.3.jar;C:\Users\CIS\.m2\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-core\6.1.12\spring-core-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-jcl\6.1.12\spring-jcl-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-test\6.1.12\spring-test-6.1.12.jar;C:\Users\CIS\.m2\repository\org\xmlunit\xmlunit-core\2.9.1\xmlunit-core-2.9.1.jar;"/>
  8 |     <property name="java.vm.vendor" value="Oracle Corporation"/>
  9 |     <property name="sun.arch.data.model" value="64"/>
 10 |     <property name="user.variant" value=""/>
 11 |     <property name="java.vendor.url" value="https://java.oracle.com/"/>
 12 |     <property name="user.timezone" value="Asia/Calcutta"/>
 13 |     <property name="org.jboss.logging.provider" value="slf4j"/>
 14 |     <property name="os.name" value="Windows 10"/>
 15 |     <property name="java.vm.specification.version" value="21"/>
 16 |     <property name="sun.java.launcher" value="SUN_STANDARD"/>
 17 |     <property name="user.country" value="US"/>
 18 |     <property name="sun.boot.library.path" value="C:\Program Files\Java\jdk-21\bin"/>
 19 |     <property name="sun.java.command" value="C:\Users\CIS\AppData\Local\Temp\surefire9923444711842711549\surefirebooter-20250830110819135_3.jar C:\Users\CIS\AppData\Local\Temp\surefire9923444711842711549 2025-08-30T11-08-17_383-jvmRun1 surefire-20250830110819135_1tmp surefire_0-20250830110819135_2tmp"/>
 20 |     <property name="jdk.debug" value="release"/>
 21 |     <property name="surefire.test.class.path" value="C:\Users\CIS\TodoList\target\test-classes;C:\Users\CIS\TodoList\target\classes;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.3.3\spring-boot-starter-web-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter\3.3.3\spring-boot-starter-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.3.3\spring-boot-starter-logging-3.3.3.jar;C:\Users\CIS\.m2\repository\ch\qos\logback\logback-classic\1.5.7\logback-classic-1.5.7.jar;C:\Users\CIS\.m2\repository\ch\qos\logback\logback-core\1.5.7\logback-core-1.5.7.jar;C:\Users\CIS\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.23.1\log4j-to-slf4j-2.23.1.jar;C:\Users\CIS\.m2\repository\org\apache\logging\log4j\log4j-api\2.23.1\log4j-api-2.23.1.jar;C:\Users\CIS\.m2\repository\org\slf4j\jul-to-slf4j\2.0.16\jul-to-slf4j-2.0.16.jar;C:\Users\CIS\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\CIS\.m2\repository\org\yaml\snakeyaml\2.2\snakeyaml-2.2.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.3.3\spring-boot-starter-json-3.3.3.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.2\jackson-databind-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.2\jackson-annotations-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.2\jackson-core-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.2\jackson-datatype-jdk8-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.2\jackson-datatype-jsr310-2.17.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.17.2\jackson-module-parameter-names-2.17.2.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.3.3\spring-boot-starter-tomcat-3.3.3.jar;C:\Users\CIS\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.28\tomcat-embed-core-10.1.28.jar;C:\Users\CIS\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.28\tomcat-embed-el-10.1.28.jar;C:\Users\CIS\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.28\tomcat-embed-websocket-10.1.28.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-web\6.1.12\spring-web-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-beans\6.1.12\spring-beans-6.1.12.jar;C:\Users\CIS\.m2\repository\io\micrometer\micrometer-observation\1.13.3\micrometer-observation-1.13.3.jar;C:\Users\CIS\.m2\repository\io\micrometer\micrometer-commons\1.13.3\micrometer-commons-1.13.3.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-webmvc\6.1.12\spring-webmvc-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-aop\6.1.12\spring-aop-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-context\6.1.12\spring-context-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-expression\6.1.12\spring-expression-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-thymeleaf\3.3.3\spring-boot-starter-thymeleaf-3.3.3.jar;C:\Users\CIS\.m2\repository\org\thymeleaf\thymeleaf-spring6\3.1.2.RELEASE\thymeleaf-spring6-3.1.2.RELEASE.jar;C:\Users\CIS\.m2\repository\org\thymeleaf\thymeleaf\3.1.2.RELEASE\thymeleaf-3.1.2.RELEASE.jar;C:\Users\CIS\.m2\repository\org\attoparser\attoparser\2.0.7.RELEASE\attoparser-2.0.7.RELEASE.jar;C:\Users\CIS\.m2\repository\org\unbescape\unbescape\1.1.6.RELEASE\unbescape-1.1.6.RELEASE.jar;C:\Users\CIS\.m2\repository\org\slf4j\slf4j-api\2.0.16\slf4j-api-2.0.16.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\3.3.3\spring-boot-starter-data-jpa-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-aop\3.3.3\spring-boot-starter-aop-3.3.3.jar;C:\Users\CIS\.m2\repository\org\aspectj\aspectjweaver\1.9.22.1\aspectjweaver-1.9.22.1.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\3.3.3\spring-boot-starter-jdbc-3.3.3.jar;C:\Users\CIS\.m2\repository\com\zaxxer\HikariCP\5.1.0\HikariCP-5.1.0.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-jdbc\6.1.12\spring-jdbc-6.1.12.jar;C:\Users\CIS\.m2\repository\org\hibernate\orm\hibernate-core\6.5.2.Final\hibernate-core-6.5.2.Final.jar;C:\Users\CIS\.m2\repository\jakarta\persistence\jakarta.persistence-api\3.1.0\jakarta.persistence-api-3.1.0.jar;C:\Users\CIS\.m2\repository\jakarta\transaction\jakarta.transaction-api\2.0.1\jakarta.transaction-api-2.0.1.jar;C:\Users\CIS\.m2\repository\org\jboss\logging\jboss-logging\3.5.3.Final\jboss-logging-3.5.3.Final.jar;C:\Users\CIS\.m2\repository\org\hibernate\common\hibernate-commons-annotations\6.0.6.Final\hibernate-commons-annotations-6.0.6.Final.jar;C:\Users\CIS\.m2\repository\io\smallrye\jandex\3.1.2\jandex-3.1.2.jar;C:\Users\CIS\.m2\repository\com\fasterxml\classmate\1.7.0\classmate-1.7.0.jar;C:\Users\CIS\.m2\repository\net\bytebuddy\byte-buddy\1.14.19\byte-buddy-1.14.19.jar;C:\Users\CIS\.m2\repository\org\glassfish\jaxb\jaxb-runtime\4.0.5\jaxb-runtime-4.0.5.jar;C:\Users\CIS\.m2\repository\org\glassfish\jaxb\jaxb-core\4.0.5\jaxb-core-4.0.5.jar;C:\Users\CIS\.m2\repository\org\eclipse\angus\angus-activation\2.0.2\angus-activation-2.0.2.jar;C:\Users\CIS\.m2\repository\org\glassfish\jaxb\txw2\4.0.5\txw2-4.0.5.jar;C:\Users\CIS\.m2\repository\com\sun\istack\istack-commons-runtime\4.1.2\istack-commons-runtime-4.1.2.jar;C:\Users\CIS\.m2\repository\jakarta\inject\jakarta.inject-api\2.0.1\jakarta.inject-api-2.0.1.jar;C:\Users\CIS\.m2\repository\org\antlr\antlr4-runtime\4.13.0\antlr4-runtime-4.13.0.jar;C:\Users\CIS\.m2\repository\org\springframework\data\spring-data-jpa\3.3.3\spring-data-jpa-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\data\spring-data-commons\3.3.3\spring-data-commons-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-orm\6.1.12\spring-orm-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-tx\6.1.12\spring-tx-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-aspects\6.1.12\spring-aspects-6.1.12.jar;C:\Users\CIS\.m2\repository\com\h2database\h2\2.2.224\h2-2.2.224.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-devtools\3.3.3\spring-boot-devtools-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot\3.3.3\spring-boot-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.3.3\spring-boot-autoconfigure-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-starter-test\3.3.3\spring-boot-starter-test-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-test\3.3.3\spring-boot-test-3.3.3.jar;C:\Users\CIS\.m2\repository\org\springframework\boot\spring-boot-test-autoconfigure\3.3.3\spring-boot-test-autoconfigure-3.3.3.jar;C:\Users\CIS\.m2\repository\com\jayway\jsonpath\json-path\2.9.0\json-path-2.9.0.jar;C:\Users\CIS\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\4.0.2\jakarta.xml.bind-api-4.0.2.jar;C:\Users\CIS\.m2\repository\jakarta\activation\jakarta.activation-api\2.1.3\jakarta.activation-api-2.1.3.jar;C:\Users\CIS\.m2\repository\net\minidev\json-smart\2.5.1\json-smart-2.5.1.jar;C:\Users\CIS\.m2\repository\net\minidev\accessors-smart\2.5.1\accessors-smart-2.5.1.jar;C:\Users\CIS\.m2\repository\org\ow2\asm\asm\9.6\asm-9.6.jar;C:\Users\CIS\.m2\repository\org\assertj\assertj-core\3.25.3\assertj-core-3.25.3.jar;C:\Users\CIS\.m2\repository\org\awaitility\awaitility\4.2.2\awaitility-4.2.2.jar;C:\Users\CIS\.m2\repository\org\hamcrest\hamcrest\2.2\hamcrest-2.2.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.3\junit-jupiter-5.10.3.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.3\junit-jupiter-api-5.10.3.jar;C:\Users\CIS\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\CIS\.m2\repository\org\junit\platform\junit-platform-commons\1.10.3\junit-platform-commons-1.10.3.jar;C:\Users\CIS\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.3\junit-jupiter-params-5.10.3.jar;C:\Users\CIS\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.3\junit-jupiter-engine-5.10.3.jar;C:\Users\CIS\.m2\repository\org\junit\platform\junit-platform-engine\1.10.3\junit-platform-engine-1.10.3.jar;C:\Users\CIS\.m2\repository\org\mockito\mockito-core\5.11.0\mockito-core-5.11.0.jar;C:\Users\CIS\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.19\byte-buddy-agent-1.14.19.jar;C:\Users\CIS\.m2\repository\org\objenesis\objenesis\3.3\objenesis-3.3.jar;C:\Users\CIS\.m2\repository\org\mockito\mockito-junit-jupiter\5.11.0\mockito-junit-jupiter-5.11.0.jar;C:\Users\CIS\.m2\repository\org\skyscreamer\jsonassert\1.5.3\jsonassert-1.5.3.jar;C:\Users\CIS\.m2\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-core\6.1.12\spring-core-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-jcl\6.1.12\spring-jcl-6.1.12.jar;C:\Users\CIS\.m2\repository\org\springframework\spring-test\6.1.12\spring-test-6.1.12.jar;C:\Users\CIS\.m2\repository\org\xmlunit\xmlunit-core\2.9.1\xmlunit-core-2.9.1.jar;"/>
 22 |     <property name="sun.cpu.endian" value="little"/>
 23 |     <property name="user.home" value="C:\Users\CIS"/>
 24 |     <property name="user.language" value="en"/>
 25 |     <property name="java.specification.vendor" value="Oracle Corporation"/>
 26 |     <property name="java.version.date" value="2025-04-15"/>
 27 |     <property name="java.home" value="C:\Program Files\Java\jdk-21"/>
 28 |     <property name="file.separator" value="\"/>
 29 |     <property name="basedir" value="C:\Users\CIS\TodoList"/>
 30 |     <property name="java.vm.compressedOopsMode" value="32-bit"/>
 31 |     <property name="line.separator" value="&#10;"/>
 32 |     <property name="java.vm.specification.vendor" value="Oracle Corporation"/>
 33 |     <property name="java.specification.name" value="Java Platform API Specification"/>
 34 |     <property name="FILE_LOG_CHARSET" value="UTF-8"/>
 35 |     <property name="java.awt.headless" value="true"/>
 36 |     <property name="surefire.real.class.path" value="C:\Users\CIS\AppData\Local\Temp\surefire9923444711842711549\surefirebooter-20250830110819135_3.jar"/>
 37 |     <property name="user.script" value=""/>
 38 |     <property name="sun.management.compiler" value="HotSpot 64-Bit Tiered Compilers"/>
 39 |     <property name="java.runtime.version" value="21.0.7+8-LTS-245"/>
 40 |     <property name="user.name" value="CIS"/>
 41 |     <property name="stdout.encoding" value="Cp1252"/>
 42 |     <property name="path.separator" value=";"/>
 43 |     <property name="os.version" value="10.0"/>
 44 |     <property name="java.runtime.name" value="Java(TM) SE Runtime Environment"/>
 45 |     <property name="file.encoding" value="UTF-8"/>
 46 |     <property name="java.vm.name" value="Java HotSpot(TM) 64-Bit Server VM"/>
 47 |     <property name="localRepository" value="C:\Users\CIS\.m2\repository"/>
 48 |     <property name="java.vendor.url.bug" value="https://bugreport.java.com/bugreport/"/>
 49 |     <property name="java.io.tmpdir" value="C:\Users\CIS\AppData\Local\Temp\"/>
 50 |     <property name="com.zaxxer.hikari.pool_number" value="1"/>
 51 |     <property name="java.version" value="21.0.7"/>
 52 |     <property name="user.dir" value="C:\Users\CIS\TodoList"/>
 53 |     <property name="os.arch" value="amd64"/>
 54 |     <property name="java.vm.specification.name" value="Java Virtual Machine Specification"/>
 55 |     <property name="PID" value="4252"/>
 56 |     <property name="sun.os.patch.level" value=""/>
 57 |     <property name="CONSOLE_LOG_CHARSET" value="UTF-8"/>
 58 |     <property name="native.encoding" value="Cp1252"/>
 59 |     <property name="java.library.path" value="C:\Program Files\Java\jdk-21\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\apache-maven-3.9.11\bin;C:\Program Files\JetBrains\javafx-sdk-21.0.8\bin;C:\Program Files\Git\cmd;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\CIS\AppData\Local\Microsoft\WindowsApps;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin;;C:\Users\CIS\AppData\Local\Programs\Microsoft VS Code\bin;."/>
 60 |     <property name="java.vm.info" value="mixed mode, sharing"/>
 61 |     <property name="stderr.encoding" value="Cp1252"/>
 62 |     <property name="java.vendor" value="Oracle Corporation"/>
 63 |     <property name="java.vm.version" value="21.0.7+8-LTS-245"/>
 64 |     <property name="sun.io.unicode.encoding" value="UnicodeLittle"/>
 65 |     <property name="java.class.version" value="65.0"/>
 66 |     <property name="LOGGED_APPLICATION_NAME" value="[TodoList App] "/>
 67 |   </properties>
 68 |   <testcase name="contextLoads" classname="com.todolist.TodoList.TodoListAppApplicationTests" time="0.663">
 69 |     <system-out><![CDATA[11:08:19.997 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.todolist.TodoList.TodoListAppApplicationTests]: TodoListAppApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
 70 | 11:08:20.119 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.todolist.TodoList.TodoListAppApplication for test class com.todolist.TodoList.TodoListAppApplicationTests
 71 | 11:08:20.303 [main] INFO org.springframework.boot.devtools.restart.RestartApplicationListener -- Restart disabled due to context in which it is running
 72 | 
 73 |   .   ____          _            __ _ _
 74 |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
 75 | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 76 |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
 77 |   '  |____| .__|_| |_|_| |_\__, | / / / /
 78 |  =========|_|==============|___/=/_/_/_/
 79 | 
 80 |  :: Spring Boot ::                (v3.3.3)
 81 | 
 82 | 2025-08-30T11:08:20.598+05:30  INFO 4252 --- [TodoList App] [           main] c.t.T.TodoListAppApplicationTests        : Starting TodoListAppApplicationTests using Java 21.0.7 with PID 4252 (started by CIS in C:\Users\CIS\TodoList)
 83 | 2025-08-30T11:08:20.599+05:30  INFO 4252 --- [TodoList App] [           main] c.t.T.TodoListAppApplicationTests        : No active profile set, falling back to 1 default profile: "default"
 84 | 2025-08-30T11:08:21.306+05:30  INFO 4252 --- [TodoList App] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
 85 | 2025-08-30T11:08:21.334+05:30  INFO 4252 --- [TodoList App] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 15 ms. Found 0 JPA repository interfaces.
 86 | 2025-08-30T11:08:21.855+05:30  INFO 4252 --- [TodoList App] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
 87 | 2025-08-30T11:08:22.075+05:30  INFO 4252 --- [TodoList App] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:eaace762-24dd-4874-940a-dff924f31b1c user=SA
 88 | 2025-08-30T11:08:22.078+05:30  INFO 4252 --- [TodoList App] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
 89 | 2025-08-30T11:08:22.141+05:30  INFO 4252 --- [TodoList App] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
 90 | 2025-08-30T11:08:22.208+05:30  INFO 4252 --- [TodoList App] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.5.2.Final
 91 | 2025-08-30T11:08:22.257+05:30  INFO 4252 --- [TodoList App] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
 92 | 2025-08-30T11:08:22.651+05:30  INFO 4252 --- [TodoList App] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
 93 | 2025-08-30T11:08:23.081+05:30  INFO 4252 --- [TodoList App] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
 94 | 2025-08-30T11:08:23.087+05:30  INFO 4252 --- [TodoList App] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
 95 | 2025-08-30T11:08:23.291+05:30  WARN 4252 --- [TodoList App] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
 96 | 2025-08-30T11:08:23.333+05:30  INFO 4252 --- [TodoList App] [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
 97 | 2025-08-30T11:08:23.879+05:30  INFO 4252 --- [TodoList App] [           main] c.t.T.TodoListAppApplicationTests        : Started TodoListAppApplicationTests in 3.592 seconds (process running for 4.63)
 98 | ]]></system-out>
 99 |     <system-err><![CDATA[WARNING: A Java agent has been loaded dynamically (C:\Users\CIS\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.19\byte-buddy-agent-1.14.19.jar)
100 | WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
101 | WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
102 | WARNING: Dynamic loading of agents will be disallowed by default in a future release
103 | ]]></system-err>
104 |   </testcase>
105 | </testsuite>


--------------------------------------------------------------------------------
/target/surefire-reports/com.todolist.TodoList.TodoListAppApplicationTests.txt:
--------------------------------------------------------------------------------
1 | -------------------------------------------------------------------------------
2 | Test set: com.todolist.TodoList.TodoListAppApplicationTests
3 | -------------------------------------------------------------------------------
4 | Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.756 s -- in com.todolist.TodoList.TodoListAppApplicationTests
5 | 


--------------------------------------------------------------------------------
/target/test-classes/com/todolist/TodoList/TodoListAppApplicationTests.class:
--------------------------------------------------------------------------------
https://raw.githubusercontent.com/CoderPK04/TodoList/main/target/test-classes/com/todolist/TodoList/TodoListAppApplicationTests.class


--------------------------------------------------------------------------------
