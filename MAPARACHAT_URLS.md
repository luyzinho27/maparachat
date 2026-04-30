# URLs do MaparaChat

## Firebase Hosting

- Web principal: `https://maparachat.web.app`
- Web alternativo: `https://maparachat.firebaseapp.com`

## Supabase Edge Function

- Base da API: `https://vkbqoqmyxesprbnzwcff.supabase.co/functions/v1/maparachat-api`
- Healthcheck: `https://vkbqoqmyxesprbnzwcff.supabase.co/functions/v1/maparachat-api/api/health`
- Manifesto da funcao: `https://vkbqoqmyxesprbnzwcff.supabase.co/functions/v1/maparachat-api`

## Onde cada URL entra

- Web:
  - `public/index.html`: `window.MAPARACHAT_BACKEND_URL`
- Android:
  - `android/app/build.gradle`: `START_URL`
  - `android/app/build.gradle`: `BACKEND_URL`
- Firebase Web SDK:
  - `public/script.js`: `authDomain = maparachat.firebaseapp.com`
  - `public/script.js`: `projectId = maparachat`

## Deploy

### Firebase Hosting

```bash
firebase deploy --only hosting
```

### Supabase Edge Function

```bash
supabase functions deploy maparachat-api --no-verify-jwt
```

## Testes rapidos

1. Abrir `https://maparachat.web.app`
2. Abrir `https://maparachat.firebaseapp.com`
3. Testar healthcheck:

```text
https://vkbqoqmyxesprbnzwcff.supabase.co/functions/v1/maparachat-api/api/health
```

4. Testar manifesto da funcao:

```text
https://vkbqoqmyxesprbnzwcff.supabase.co/functions/v1/maparachat-api
```
