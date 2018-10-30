# Shadow-cljs + Hoplon + Electron

Pretty much just the first working example from https://github.com/hoplon/hoplon/wiki/Get-Started
but using shadow-cljs instead of boot and targeted at (atom) electron browser/platform.

Instructions w/yarn:
```
yarn global add electron
yarn global add shadow-cljs
yarn global add jquery
yarn

```

Instructions w/npm:

```
npm i -g electron
npm i -g shadow-cljs
npm i -g jquery


```
Then (for both):

# in one terminal (optional, but much quicker to develop with):
```
shadow-cljs server
```

# then in another terminal, leave this running:

```
shadow-cljs watch electron client
```
# in yet another terminal (from the project's root directory) when the builds completed

```
electron app/main.js
```

# Notes:

Due to a bug, hoplon must currently be kept at v. 7.1.0 or below (or upon
reloads the app is re-added below in the UI instead of replacing previous version)

This should work with cider. Just do M-x cider-connect-cljs from one of the
project's clojure(script) files, select the default host/port, and shadow for
the middleware type, and build-id either `electron` (to REPL IN the backend/node side) or
`client` (to REPL in the UI side).

As of this date, currently, cider doesn't support both REPLs being open at the same time
(see issue: https://github.com/clojure-emacs/cider/issues/2494)

This would be a good platform to migrate into degree9's [meta] framework.

# Acknowledgments:

Many thanks to Matt Ratske (@flyboarder) who basically took my idea and ran with it.
