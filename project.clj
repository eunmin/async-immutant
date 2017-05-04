(defproject async-immutant "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.immutant/web "2.1.6"]
                 [metosin/compojure-api "1.2.0-alpha5" :exclude [compojure metosin/muuntaja]]
                 [ring/ring-core "1.6.0"]
                 [ring/ring "1.6.0"]
                 [compojure "1.6.0"]
                 [org.clojure/core.async "0.3.441"]
                 [manifold "0.1.6"]]
  :main async-immutant.core)
